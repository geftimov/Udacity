package com.eftimoff.udacity.features.portfolio.adapter;

import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.eftimoff.udacity.R;
import com.eftimoff.udacity.models.Project;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by georgieftimov on 06/04/16.
 */
public class ProjectAdapter extends RecyclerView.Adapter<ProjectAdapter.ViewHolder> {

    private List<Project> projects = new ArrayList<>();
    private ProjectAdapterCallback projectAdapterCallback;

    public ProjectAdapter(ProjectAdapterCallback projectAdapterCallback) {
        this.projectAdapterCallback = projectAdapterCallback;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_project, parent, false);
        final ViewHolder viewHolder = new ViewHolder(view);
        viewHolder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Project project = projects.get(viewHolder.getAdapterPosition());
                projectAdapterCallback.onProjectClicked(project);
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Project project = projects.get(position);
        final int color = ContextCompat.getColor(holder.button.getContext(), project.getColor());
        holder.button.setBackgroundColor(color);
        holder.button.setText(project.getTitle());
    }

    @Override
    public int getItemCount() {
        return projects.size();
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public Button button;

        public ViewHolder(View v) {
            super(v);
            button = (Button) v.findViewById(R.id.button);
        }
    }
}

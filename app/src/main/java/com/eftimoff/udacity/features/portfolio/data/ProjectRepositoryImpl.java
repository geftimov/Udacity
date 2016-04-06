package com.eftimoff.udacity.features.portfolio.data;

import com.eftimoff.udacity.R;
import com.eftimoff.udacity.models.Project;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by georgieftimov on 06/04/16.
 */
public class ProjectRepositoryImpl implements ProjectRepository {

    private List<Project> projects = new ArrayList<>();

    public ProjectRepositoryImpl() {
        projects.add(new Project(R.string.project_spotify, R.color.orange));
        projects.add(new Project(R.string.project_scores, R.color.orange));
        projects.add(new Project(R.string.project_library, R.color.orange));
        projects.add(new Project(R.string.project_build_it_bigger, R.color.orange));
        projects.add(new Project(R.string.project_bacon_reader, R.color.orange));
        projects.add(new Project(R.string.project_capstone, R.color.red));
    }

    @Override
    public void create(Project project) {
        projects.add(project);
    }

    @Override
    public List<Project> getAll() {
        return projects;
    }

    @Override
    public void delete(Project project) {
        projects.remove(project);
    }
}

package com.eftimoff.udacity.features.portfolio;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.eftimoff.udacity.R;
import com.eftimoff.udacity.common.BaseActivity;
import com.eftimoff.udacity.features.portfolio.adapter.ProjectAdapter;
import com.eftimoff.udacity.features.portfolio.adapter.ProjectAdapterCallback;
import com.eftimoff.udacity.features.portfolio.data.ProjectRepository;
import com.eftimoff.udacity.features.portfolio.data.ProjectRepositoryImpl;
import com.eftimoff.udacity.features.portfolio.presentation.PortfolioPresentationImpl;
import com.eftimoff.udacity.features.portfolio.presentation.PortfolioPresenter;
import com.eftimoff.udacity.models.Project;

import java.util.List;

public class PortfolioActivity extends BaseActivity implements PortfolioView, ProjectAdapterCallback {

    //Fields
    private PortfolioPresenter portfolioPresenter;
    private RecyclerView.LayoutManager layoutManager;
    private ProjectAdapter projectAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(projectAdapter);
        portfolioPresenter.requestAllProjects();
    }

    @Override
    protected void initFields() {
        layoutManager = new LinearLayoutManager(this);
        projectAdapter = new ProjectAdapter(this);
        final ProjectRepository projectRepository = new ProjectRepositoryImpl();
        portfolioPresenter = new PortfolioPresentationImpl(this, projectRepository);
    }

    @Override
    public void onProjectsSuccess(List<Project> projects) {
        projectAdapter.setProjects(projects);
    }

    @Override
    public void onProjectClicked(Project project) {
        final String title = getString(project.getTitle()).toLowerCase();
        Toast.makeText(this, getString(R.string.activity_portfolio_toast_message, title), Toast.LENGTH_LONG).show();
    }
}

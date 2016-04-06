package com.eftimoff.udacity.features.portfolio.presentation;

import com.eftimoff.udacity.features.portfolio.PortfolioView;
import com.eftimoff.udacity.features.portfolio.data.ProjectRepository;
import com.eftimoff.udacity.models.Project;

import java.util.List;

/**
 * Created by georgieftimov on 06/04/16.
 */
public class PortfolioPresentationImpl implements PortfolioPresenter {

    private PortfolioView portfolioView;
    private ProjectRepository projectRepository;

    public PortfolioPresentationImpl(final PortfolioView portfolioView, final ProjectRepository projectRepository) {
        this.portfolioView = portfolioView;
        this.projectRepository = projectRepository;
    }

    @Override
    public void requestAllProjects() {
        final List<Project> projects = projectRepository.getAll();
        portfolioView.onProjectsSuccess(projects);
    }
}

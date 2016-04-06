package com.eftimoff.udacity.features.portfolio;

import com.eftimoff.udacity.models.Project;

import java.util.List;

/**
 * Created by georgieftimov on 06/04/16.
 */
public interface PortfolioView {

    void onProjectsSuccess(final List<Project> projects);
}

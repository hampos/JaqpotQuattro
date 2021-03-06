/*
 *
 * JAQPOT Quattro
 *
 * JAQPOT Quattro and the components shipped with it, in particular:
 * (i)   JaqpotCoreServices
 * (ii)  JaqpotAlgorithmServices
 * (iii) JaqpotDB
 * (iv)  JaqpotDomain
 * (v)   JaqpotEAR
 * are licensed by GPL v3 as specified hereafter. Additional components may ship
 * with some other licence as will be specified therein.
 *
 * Copyright (C) 2014-2015 KinkyDesign (Charalampos Chomenidis, Pantelis Sopasakis)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Source code:
 * The source code of JAQPOT Quattro is available on github at:
 * https://github.com/KinkyDesign/JaqpotQuattro
 * All source files of JAQPOT Quattro that are stored on github are licensed
 * with the aforementioned licence. 
 */
package org.jaqpot.core.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Pantelis Sopasakis
 * @author Charalampos Chomenidis
 *
 */
@XmlRootElement
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserQuota {

    private String userId;
    private Long tasks;
    private Long tasksRunning;
    private Long models;
    private Long algorithms;
    private Long datasets;
    private Long bibtex;
    private Long reports;

    public UserQuota() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getTasks() {
        return tasks;
    }

    public void setTasks(Long tasks) {
        this.tasks = tasks;
    }

    public Long getTasksRunning() {
        return tasksRunning;
    }

    public void setTasksRunning(Long tasksRunning) {
        this.tasksRunning = tasksRunning;
    }

    public Long getModels() {
        return models;
    }

    public void setModels(Long models) {
        this.models = models;
    }

    public Long getAlgorithms() {
        return algorithms;
    }

    public void setAlgorithms(Long algorithms) {
        this.algorithms = algorithms;
    }

    public Long getDatasets() {
        return datasets;
    }

    public void setDatasets(Long datasets) {
        this.datasets = datasets;
    }

    public Long getBibtex() {
        return bibtex;
    }

    public void setBibtex(Long bibtex) {
        this.bibtex = bibtex;
    }

    public Long getReports() {
        return reports;
    }

    public void setReports(Long reports) {
        this.reports = reports;
    }

}

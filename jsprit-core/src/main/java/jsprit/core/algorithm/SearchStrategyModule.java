/*******************************************************************************
 * Copyright (C) 2013  Stefan Schroeder
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package jsprit.core.algorithm;

import jsprit.core.algorithm.listener.SearchStrategyModuleListener;
import jsprit.core.problem.solution.VehicleRoutingProblemSolution;


public interface SearchStrategyModule {

    public VehicleRoutingProblemSolution runAndGetSolution(VehicleRoutingProblemSolution vrpSolution);

    public String getName();

    public void addModuleListener(SearchStrategyModuleListener moduleListener);

}

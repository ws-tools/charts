package com.vaadin.addon.charts.client.ui;

/*
 * #%L
 * Vaadin Charts
 * %%
 * Copyright (C) 2012 Vaadin Ltd
 * %%
 * This program is available under Commercial Vaadin Add-On License 2.0
 * (CVALv2).
 * 
 * See the file licensing.txt distributed with this software for more
 * information about licensing.
 * 
 * You should have received a copy of the CVALv2 along with this program.
 * If not, see <http://vaadin.com/license/cval-2.0>.
 * #L%
 */

import com.vaadin.shared.communication.ClientRpc;

public interface ChartClientRpc extends ClientRpc {

    /**
     * Adds a new point into series that is found from seriesIndex
     * 
     * @param x
     * @param y
     * @param seriesIndex
     */
    void addPoint(double x, double y, int seriesIndex);

    /**
     * Removes the first point which is found from given "coordinates"
     * 
     * @param x
     * @param y
     */
    void removePoint(double x, double y);

    /**
     * Updates the value of given point in the given series
     * 
     * @param seriesIndex
     * @param pointIndex
     * @param newValue
     */
    void updatePointValue(int seriesIndex, int pointIndex, double newValue);

    /**
     * redraw: Boolean Defaults to true. Whether to redraw the chart after the
     * point is altered.
     * 
     * @param redraw
     */
    void setRedrawAfterUpdate(boolean redraw);

    /**
     * animation: Mixed Defaults to true. When true, the move will be animated
     * with default animation options. The animation can also be a configuration
     * object with properties duration and easing.
     * 
     * @param animationAfterUpdate
     */
    void setAnimationAfterUpdate(boolean animationAfterUpdate);

    /**
     * Defaults to false. When shift is true, one point is shifted off the start
     * of the series as one is appended to the end. Use this option for live
     * charts monitoring a value over time.
     * 
     * @param shiftAfterUpdate
     */
    void setShiftAfterUpdate(boolean shiftAfterUpdate);

}
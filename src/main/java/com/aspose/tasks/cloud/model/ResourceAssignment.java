/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2021 Aspose.Tasks Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------
 */

package com.aspose.tasks.cloud.model;

import java.util.Objects;
import java.util.Arrays;
import com.aspose.tasks.cloud.model.AssignmentBaseline;
import com.aspose.tasks.cloud.model.BookingType;
import com.aspose.tasks.cloud.model.ExtendedAttribute;
import com.aspose.tasks.cloud.model.RateScaleType;
import com.aspose.tasks.cloud.model.RateType;
import com.aspose.tasks.cloud.model.TimeUnitType;
import com.aspose.tasks.cloud.model.TimephasedData;
import com.aspose.tasks.cloud.model.WorkContourType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Represents a resource assignment in a project.
 */
@ApiModel(description = "Represents a resource assignment in a project.")

public class ResourceAssignment {
  @SerializedName("TaskUid")
  private Integer taskUid = -1;

  @SerializedName("ResourceUid")
  private Integer resourceUid = -1;

  @SerializedName("Guid")
  private String guid = null;

  @SerializedName("Uid")
  private Integer uid = null;

  @SerializedName("PercentWorkComplete")
  private Integer percentWorkComplete = null;

  @SerializedName("ActualCost")
  private BigDecimal actualCost = null;

  @SerializedName("ActualFinish")
  private OffsetDateTime actualFinish = null;

  @SerializedName("ActualOvertimeCost")
  private BigDecimal actualOvertimeCost = null;

  @SerializedName("ActualOvertimeWork")
  private String actualOvertimeWork = null;

  @SerializedName("ActualStart")
  private OffsetDateTime actualStart = null;

  @SerializedName("ActualWork")
  private String actualWork = null;

  @SerializedName("Acwp")
  private Double acwp = null;

  @SerializedName("Confirmed")
  private Boolean confirmed = null;

  @SerializedName("Cost")
  private BigDecimal cost = null;

  @SerializedName("CostRateTableType")
  private RateType costRateTableType = null;

  @SerializedName("CostVariance")
  private Double costVariance = null;

  @SerializedName("Cv")
  private Double cv = null;

  @SerializedName("Delay")
  private Integer delay = null;

  @SerializedName("Finish")
  private OffsetDateTime finish = null;

  @SerializedName("FinishVariance")
  private Integer finishVariance = null;

  @SerializedName("Hyperlink")
  private String hyperlink = null;

  @SerializedName("HyperlinkAddress")
  private String hyperlinkAddress = null;

  @SerializedName("HyperlinkSubAddress")
  private String hyperlinkSubAddress = null;

  @SerializedName("WorkVariance")
  private Double workVariance = null;

  @SerializedName("HasFixedRateUnits")
  private Boolean hasFixedRateUnits = null;

  @SerializedName("FixedMaterial")
  private Boolean fixedMaterial = null;

  @SerializedName("LevelingDelay")
  private Integer levelingDelay = null;

  @SerializedName("LevelingDelayFormat")
  private TimeUnitType levelingDelayFormat = null;

  @SerializedName("LinkedFields")
  private Boolean linkedFields = null;

  @SerializedName("Milestone")
  private Boolean milestone = null;

  @SerializedName("Notes")
  private String notes = null;

  @SerializedName("Overallocated")
  private Boolean overallocated = null;

  @SerializedName("OvertimeCost")
  private BigDecimal overtimeCost = null;

  @SerializedName("OvertimeWork")
  private String overtimeWork = null;

  @SerializedName("PeakUnits")
  private Double peakUnits = null;

  @SerializedName("RegularWork")
  private String regularWork = null;

  @SerializedName("RemainingCost")
  private BigDecimal remainingCost = null;

  @SerializedName("RemainingOvertimeCost")
  private BigDecimal remainingOvertimeCost = null;

  @SerializedName("RemainingOvertimeWork")
  private String remainingOvertimeWork = null;

  @SerializedName("RemainingWork")
  private String remainingWork = null;

  @SerializedName("ResponsePending")
  private Boolean responsePending = null;

  @SerializedName("Start")
  private OffsetDateTime start = null;

  @SerializedName("Stop")
  private OffsetDateTime stop = null;

  @SerializedName("Resume")
  private OffsetDateTime resume = null;

  @SerializedName("StartVariance")
  private Integer startVariance = null;

  @SerializedName("Summary")
  private Boolean summary = null;

  @SerializedName("Sv")
  private Double sv = null;

  @SerializedName("Units")
  private Double units = 1.0d;

  @SerializedName("UpdateNeeded")
  private Boolean updateNeeded = null;

  @SerializedName("Vac")
  private Double vac = null;

  @SerializedName("Work")
  private String work = null;

  @SerializedName("WorkContour")
  private WorkContourType workContour = null;

  @SerializedName("Bcws")
  private Double bcws = null;

  @SerializedName("Bcwp")
  private Double bcwp = null;

  @SerializedName("BookingType")
  private BookingType bookingType = null;

  @SerializedName("ActualWorkProtected")
  private String actualWorkProtected = null;

  @SerializedName("ActualOvertimeWorkProtected")
  private String actualOvertimeWorkProtected = null;

  @SerializedName("CreationDate")
  private OffsetDateTime creationDate = null;

  @SerializedName("AssnOwner")
  private String assnOwner = null;

  @SerializedName("AssnOwnerGuid")
  private String assnOwnerGuid = null;

  @SerializedName("BudgetCost")
  private BigDecimal budgetCost = null;

  @SerializedName("BudgetWork")
  private String budgetWork = null;

  @SerializedName("RateScale")
  private RateScaleType rateScale = null;

  @SerializedName("Baselines")
  private List<AssignmentBaseline> baselines = null;

  @SerializedName("ExtendedAttributes")
  private List<ExtendedAttribute> extendedAttributes = null;

  @SerializedName("TimephasedData")
  private List<TimephasedData> timephasedData = null;

  public ResourceAssignment taskUid(Integer taskUid) {
    this.taskUid = taskUid;
    return this;
  }

   /**
   * Returns or sets a task unique id to which a resource is assigned.
   * @return taskUid
  **/
  @ApiModelProperty(required = true, value = "Returns or sets a task unique id to which a resource is assigned.")
  public Integer getTaskUid() {
    return taskUid;
  }

  public void setTaskUid(Integer taskUid) {
    this.taskUid = taskUid;
  }

  public ResourceAssignment resourceUid(Integer resourceUid) {
    this.resourceUid = resourceUid;
    return this;
  }

   /**
   * Returns or sets a resource unique id assigned to a task.
   * @return resourceUid
  **/
  @ApiModelProperty(required = true, value = "Returns or sets a resource unique id assigned to a task.")
  public Integer getResourceUid() {
    return resourceUid;
  }

  public void setResourceUid(Integer resourceUid) {
    this.resourceUid = resourceUid;
  }

  public ResourceAssignment guid(String guid) {
    this.guid = guid;
    return this;
  }

   /**
   * Returns or sets the global unique identifier of an assignment.
   * @return guid
  **/
  @ApiModelProperty(value = "Returns or sets the global unique identifier of an assignment.")
  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public ResourceAssignment uid(Integer uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Returns or sets the unique identifier of an assignment.
   * @return uid
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the unique identifier of an assignment.")
  public Integer getUid() {
    return uid;
  }

  public void setUid(Integer uid) {
    this.uid = uid;
  }

  public ResourceAssignment percentWorkComplete(Integer percentWorkComplete) {
    this.percentWorkComplete = percentWorkComplete;
    return this;
  }

   /**
   * Returns or sets the amount of a work completed on an assignment.
   * @return percentWorkComplete
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the amount of a work completed on an assignment.")
  public Integer getPercentWorkComplete() {
    return percentWorkComplete;
  }

  public void setPercentWorkComplete(Integer percentWorkComplete) {
    this.percentWorkComplete = percentWorkComplete;
  }

  public ResourceAssignment actualCost(BigDecimal actualCost) {
    this.actualCost = actualCost;
    return this;
  }

   /**
   * Returns or sets the actual cost incurred on an assignment.
   * @return actualCost
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the actual cost incurred on an assignment.")
  public BigDecimal getActualCost() {
    return actualCost;
  }

  public void setActualCost(BigDecimal actualCost) {
    this.actualCost = actualCost;
  }

  public ResourceAssignment actualFinish(OffsetDateTime actualFinish) {
    this.actualFinish = actualFinish;
    return this;
  }

   /**
   * Returns or sets the actual finish date of an assignment.
   * @return actualFinish
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the actual finish date of an assignment.")
  public OffsetDateTime getActualFinish() {
    return actualFinish;
  }

  public void setActualFinish(OffsetDateTime actualFinish) {
    this.actualFinish = actualFinish;
  }

  public ResourceAssignment actualOvertimeCost(BigDecimal actualOvertimeCost) {
    this.actualOvertimeCost = actualOvertimeCost;
    return this;
  }

   /**
   * Returns or sets the actual overtime cost incurred on an assignment.
   * @return actualOvertimeCost
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the actual overtime cost incurred on an assignment.")
  public BigDecimal getActualOvertimeCost() {
    return actualOvertimeCost;
  }

  public void setActualOvertimeCost(BigDecimal actualOvertimeCost) {
    this.actualOvertimeCost = actualOvertimeCost;
  }

  public ResourceAssignment actualOvertimeWork(String actualOvertimeWork) {
    this.actualOvertimeWork = actualOvertimeWork;
    return this;
  }

   /**
   * Returns or sets the actual amount of an overtime work incurred on an assignment.
   * @return actualOvertimeWork
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the actual amount of an overtime work incurred on an assignment.")
  public String getActualOvertimeWork() {
    return actualOvertimeWork;
  }

  public void setActualOvertimeWork(String actualOvertimeWork) {
    this.actualOvertimeWork = actualOvertimeWork;
  }

  public ResourceAssignment actualStart(OffsetDateTime actualStart) {
    this.actualStart = actualStart;
    return this;
  }

   /**
   * Returns or sets the actual start date of an assignment.
   * @return actualStart
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the actual start date of an assignment.")
  public OffsetDateTime getActualStart() {
    return actualStart;
  }

  public void setActualStart(OffsetDateTime actualStart) {
    this.actualStart = actualStart;
  }

  public ResourceAssignment actualWork(String actualWork) {
    this.actualWork = actualWork;
    return this;
  }

   /**
   * Returns or sets the actual amount of a work incurred on an assignment.
   * @return actualWork
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the actual amount of a work incurred on an assignment.")
  public String getActualWork() {
    return actualWork;
  }

  public void setActualWork(String actualWork) {
    this.actualWork = actualWork;
  }

  public ResourceAssignment acwp(Double acwp) {
    this.acwp = acwp;
    return this;
  }

   /**
   * Returns or sets the actual cost of a work performed on an assignment to-date.
   * @return acwp
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the actual cost of a work performed on an assignment to-date.")
  public Double getAcwp() {
    return acwp;
  }

  public void setAcwp(Double acwp) {
    this.acwp = acwp;
  }

  public ResourceAssignment confirmed(Boolean confirmed) {
    this.confirmed = confirmed;
    return this;
  }

   /**
   * Determines whether a resource has accepted all of its assignments.
   * @return confirmed
  **/
  @ApiModelProperty(required = true, value = "Determines whether a resource has accepted all of its assignments.")
  public Boolean isConfirmed() {
    return confirmed;
  }

  public void setConfirmed(Boolean confirmed) {
    this.confirmed = confirmed;
  }

  public ResourceAssignment cost(BigDecimal cost) {
    this.cost = cost;
    return this;
  }

   /**
   * Returns or sets the projected or scheduled cost of an assignment.
   * @return cost
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the projected or scheduled cost of an assignment.")
  public BigDecimal getCost() {
    return cost;
  }

  public void setCost(BigDecimal cost) {
    this.cost = cost;
  }

  public ResourceAssignment costRateTableType(RateType costRateTableType) {
    this.costRateTableType = costRateTableType;
    return this;
  }

   /**
   * Returns or sets the cost rate table used for this assignment.
   * @return costRateTableType
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the cost rate table used for this assignment.")
  public RateType getCostRateTableType() {
    return costRateTableType;
  }

  public void setCostRateTableType(RateType costRateTableType) {
    this.costRateTableType = costRateTableType;
  }

  public ResourceAssignment costVariance(Double costVariance) {
    this.costVariance = costVariance;
    return this;
  }

   /**
   * Returns or sets the difference between the cost and baseline cost of a resource.
   * @return costVariance
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the difference between the cost and baseline cost of a resource.")
  public Double getCostVariance() {
    return costVariance;
  }

  public void setCostVariance(Double costVariance) {
    this.costVariance = costVariance;
  }

  public ResourceAssignment cv(Double cv) {
    this.cv = cv;
    return this;
  }

   /**
   * Returns or sets the earned value cost variance.
   * @return cv
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the earned value cost variance.")
  public Double getCv() {
    return cv;
  }

  public void setCv(Double cv) {
    this.cv = cv;
  }

  public ResourceAssignment delay(Integer delay) {
    this.delay = delay;
    return this;
  }

   /**
   * Returns or sets the delay of an assignment.
   * @return delay
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the delay of an assignment.")
  public Integer getDelay() {
    return delay;
  }

  public void setDelay(Integer delay) {
    this.delay = delay;
  }

  public ResourceAssignment finish(OffsetDateTime finish) {
    this.finish = finish;
    return this;
  }

   /**
   * Returns or sets the scheduled finish date of an assignment.
   * @return finish
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the scheduled finish date of an assignment.")
  public OffsetDateTime getFinish() {
    return finish;
  }

  public void setFinish(OffsetDateTime finish) {
    this.finish = finish;
  }

  public ResourceAssignment finishVariance(Integer finishVariance) {
    this.finishVariance = finishVariance;
    return this;
  }

   /**
   * Returns or sets the variance of an assignment finish date from a baseline finish date.
   * @return finishVariance
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the variance of an assignment finish date from a baseline finish date.")
  public Integer getFinishVariance() {
    return finishVariance;
  }

  public void setFinishVariance(Integer finishVariance) {
    this.finishVariance = finishVariance;
  }

  public ResourceAssignment hyperlink(String hyperlink) {
    this.hyperlink = hyperlink;
    return this;
  }

   /**
   * Returns or sets the title of the hyperlink associated with an assignment.
   * @return hyperlink
  **/
  @ApiModelProperty(value = "Returns or sets the title of the hyperlink associated with an assignment.")
  public String getHyperlink() {
    return hyperlink;
  }

  public void setHyperlink(String hyperlink) {
    this.hyperlink = hyperlink;
  }

  public ResourceAssignment hyperlinkAddress(String hyperlinkAddress) {
    this.hyperlinkAddress = hyperlinkAddress;
    return this;
  }

   /**
   * Returns or sets the hyperlink associated with an assignment.
   * @return hyperlinkAddress
  **/
  @ApiModelProperty(value = "Returns or sets the hyperlink associated with an assignment.")
  public String getHyperlinkAddress() {
    return hyperlinkAddress;
  }

  public void setHyperlinkAddress(String hyperlinkAddress) {
    this.hyperlinkAddress = hyperlinkAddress;
  }

  public ResourceAssignment hyperlinkSubAddress(String hyperlinkSubAddress) {
    this.hyperlinkSubAddress = hyperlinkSubAddress;
    return this;
  }

   /**
   * Returns or sets the document bookmark of the hyperlink associated with an assignment.
   * @return hyperlinkSubAddress
  **/
  @ApiModelProperty(value = "Returns or sets the document bookmark of the hyperlink associated with an assignment.")
  public String getHyperlinkSubAddress() {
    return hyperlinkSubAddress;
  }

  public void setHyperlinkSubAddress(String hyperlinkSubAddress) {
    this.hyperlinkSubAddress = hyperlinkSubAddress;
  }

  public ResourceAssignment workVariance(Double workVariance) {
    this.workVariance = workVariance;
    return this;
  }

   /**
   * Returns or sets the variance of an assignment work from the baseline work as minutes.
   * @return workVariance
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the variance of an assignment work from the baseline work as minutes.")
  public Double getWorkVariance() {
    return workVariance;
  }

  public void setWorkVariance(Double workVariance) {
    this.workVariance = workVariance;
  }

  public ResourceAssignment hasFixedRateUnits(Boolean hasFixedRateUnits) {
    this.hasFixedRateUnits = hasFixedRateUnits;
    return this;
  }

   /**
   * Determines whether the Units have Fixed Rate.
   * @return hasFixedRateUnits
  **/
  @ApiModelProperty(required = true, value = "Determines whether the Units have Fixed Rate.")
  public Boolean isHasFixedRateUnits() {
    return hasFixedRateUnits;
  }

  public void setHasFixedRateUnits(Boolean hasFixedRateUnits) {
    this.hasFixedRateUnits = hasFixedRateUnits;
  }

  public ResourceAssignment fixedMaterial(Boolean fixedMaterial) {
    this.fixedMaterial = fixedMaterial;
    return this;
  }

   /**
   * Determines whether the consumption of an assigned material resource occurs in a single, fixed amount.
   * @return fixedMaterial
  **/
  @ApiModelProperty(required = true, value = "Determines whether the consumption of an assigned material resource occurs in a single, fixed amount.")
  public Boolean isFixedMaterial() {
    return fixedMaterial;
  }

  public void setFixedMaterial(Boolean fixedMaterial) {
    this.fixedMaterial = fixedMaterial;
  }

  public ResourceAssignment levelingDelay(Integer levelingDelay) {
    this.levelingDelay = levelingDelay;
    return this;
  }

   /**
   * Returns or sets the delay caused by leveling.
   * @return levelingDelay
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the delay caused by leveling.")
  public Integer getLevelingDelay() {
    return levelingDelay;
  }

  public void setLevelingDelay(Integer levelingDelay) {
    this.levelingDelay = levelingDelay;
  }

  public ResourceAssignment levelingDelayFormat(TimeUnitType levelingDelayFormat) {
    this.levelingDelayFormat = levelingDelayFormat;
    return this;
  }

   /**
   * Returns or sets the duration format of a delay.
   * @return levelingDelayFormat
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the duration format of a delay.")
  public TimeUnitType getLevelingDelayFormat() {
    return levelingDelayFormat;
  }

  public void setLevelingDelayFormat(TimeUnitType levelingDelayFormat) {
    this.levelingDelayFormat = levelingDelayFormat;
  }

  public ResourceAssignment linkedFields(Boolean linkedFields) {
    this.linkedFields = linkedFields;
    return this;
  }

   /**
   * Determines whether the Project is linked to another OLE object.
   * @return linkedFields
  **/
  @ApiModelProperty(required = true, value = "Determines whether the Project is linked to another OLE object.")
  public Boolean isLinkedFields() {
    return linkedFields;
  }

  public void setLinkedFields(Boolean linkedFields) {
    this.linkedFields = linkedFields;
  }

  public ResourceAssignment milestone(Boolean milestone) {
    this.milestone = milestone;
    return this;
  }

   /**
   * Determines whether the assignment is a milestone.
   * @return milestone
  **/
  @ApiModelProperty(required = true, value = "Determines whether the assignment is a milestone.")
  public Boolean isMilestone() {
    return milestone;
  }

  public void setMilestone(Boolean milestone) {
    this.milestone = milestone;
  }

  public ResourceAssignment notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Returns or sets the text notes associated with an assignment.
   * @return notes
  **/
  @ApiModelProperty(value = "Returns or sets the text notes associated with an assignment.")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public ResourceAssignment overallocated(Boolean overallocated) {
    this.overallocated = overallocated;
    return this;
  }

   /**
   * Determines whether the assignment is overallocated.
   * @return overallocated
  **/
  @ApiModelProperty(required = true, value = "Determines whether the assignment is overallocated.")
  public Boolean isOverallocated() {
    return overallocated;
  }

  public void setOverallocated(Boolean overallocated) {
    this.overallocated = overallocated;
  }

  public ResourceAssignment overtimeCost(BigDecimal overtimeCost) {
    this.overtimeCost = overtimeCost;
    return this;
  }

   /**
   * Returns or sets the sum of the actual and remaining overtime cost of an assignment.
   * @return overtimeCost
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the sum of the actual and remaining overtime cost of an assignment.")
  public BigDecimal getOvertimeCost() {
    return overtimeCost;
  }

  public void setOvertimeCost(BigDecimal overtimeCost) {
    this.overtimeCost = overtimeCost;
  }

  public ResourceAssignment overtimeWork(String overtimeWork) {
    this.overtimeWork = overtimeWork;
    return this;
  }

   /**
   * Returns or sets the scheduled overtime work of an assignment.
   * @return overtimeWork
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the scheduled overtime work of an assignment.")
  public String getOvertimeWork() {
    return overtimeWork;
  }

  public void setOvertimeWork(String overtimeWork) {
    this.overtimeWork = overtimeWork;
  }

  public ResourceAssignment peakUnits(Double peakUnits) {
    this.peakUnits = peakUnits;
    return this;
  }

   /**
   * Returns or sets the largest number of a resource&#39;s units assigned to a task.
   * @return peakUnits
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the largest number of a resource's units assigned to a task.")
  public Double getPeakUnits() {
    return peakUnits;
  }

  public void setPeakUnits(Double peakUnits) {
    this.peakUnits = peakUnits;
  }

  public ResourceAssignment regularWork(String regularWork) {
    this.regularWork = regularWork;
    return this;
  }

   /**
   * Returns or sets the amount of a non-overtime work scheduled for an assignment.
   * @return regularWork
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the amount of a non-overtime work scheduled for an assignment.")
  public String getRegularWork() {
    return regularWork;
  }

  public void setRegularWork(String regularWork) {
    this.regularWork = regularWork;
  }

  public ResourceAssignment remainingCost(BigDecimal remainingCost) {
    this.remainingCost = remainingCost;
    return this;
  }

   /**
   * Returns or sets the remaining projected cost of completing an assignment.
   * @return remainingCost
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the remaining projected cost of completing an assignment.")
  public BigDecimal getRemainingCost() {
    return remainingCost;
  }

  public void setRemainingCost(BigDecimal remainingCost) {
    this.remainingCost = remainingCost;
  }

  public ResourceAssignment remainingOvertimeCost(BigDecimal remainingOvertimeCost) {
    this.remainingOvertimeCost = remainingOvertimeCost;
    return this;
  }

   /**
   * Returns or sets the remaining projected overtime cost of completing an assignment.
   * @return remainingOvertimeCost
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the remaining projected overtime cost of completing an assignment.")
  public BigDecimal getRemainingOvertimeCost() {
    return remainingOvertimeCost;
  }

  public void setRemainingOvertimeCost(BigDecimal remainingOvertimeCost) {
    this.remainingOvertimeCost = remainingOvertimeCost;
  }

  public ResourceAssignment remainingOvertimeWork(String remainingOvertimeWork) {
    this.remainingOvertimeWork = remainingOvertimeWork;
    return this;
  }

   /**
   * Returns or sets the remaining overtime work scheduled to complete an assignment.
   * @return remainingOvertimeWork
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the remaining overtime work scheduled to complete an assignment.")
  public String getRemainingOvertimeWork() {
    return remainingOvertimeWork;
  }

  public void setRemainingOvertimeWork(String remainingOvertimeWork) {
    this.remainingOvertimeWork = remainingOvertimeWork;
  }

  public ResourceAssignment remainingWork(String remainingWork) {
    this.remainingWork = remainingWork;
    return this;
  }

   /**
   * Returns or sets the remaining work scheduled to complete an assignment.
   * @return remainingWork
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the remaining work scheduled to complete an assignment.")
  public String getRemainingWork() {
    return remainingWork;
  }

  public void setRemainingWork(String remainingWork) {
    this.remainingWork = remainingWork;
  }

  public ResourceAssignment responsePending(Boolean responsePending) {
    this.responsePending = responsePending;
    return this;
  }

   /**
   * Determines whether the response has been received for a TeamAssign message.
   * @return responsePending
  **/
  @ApiModelProperty(required = true, value = "Determines whether the response has been received for a TeamAssign message.")
  public Boolean isResponsePending() {
    return responsePending;
  }

  public void setResponsePending(Boolean responsePending) {
    this.responsePending = responsePending;
  }

  public ResourceAssignment start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * Returns or sets the scheduled start date of an assignment.
   * @return start
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the scheduled start date of an assignment.")
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  public ResourceAssignment stop(OffsetDateTime stop) {
    this.stop = stop;
    return this;
  }

   /**
   * Returns or sets the date when assignment is stopped.
   * @return stop
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the date when assignment is stopped.")
  public OffsetDateTime getStop() {
    return stop;
  }

  public void setStop(OffsetDateTime stop) {
    this.stop = stop;
  }

  public ResourceAssignment resume(OffsetDateTime resume) {
    this.resume = resume;
    return this;
  }

   /**
   * Returns or sets the date when assignment is resumed.
   * @return resume
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the date when assignment is resumed.")
  public OffsetDateTime getResume() {
    return resume;
  }

  public void setResume(OffsetDateTime resume) {
    this.resume = resume;
  }

  public ResourceAssignment startVariance(Integer startVariance) {
    this.startVariance = startVariance;
    return this;
  }

   /**
   * Returns or sets the variance of an assignment start date from a baseline start date.
   * @return startVariance
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the variance of an assignment start date from a baseline start date.")
  public Integer getStartVariance() {
    return startVariance;
  }

  public void setStartVariance(Integer startVariance) {
    this.startVariance = startVariance;
  }

  public ResourceAssignment summary(Boolean summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Determines whether the task is a summary task.
   * @return summary
  **/
  @ApiModelProperty(required = true, value = "Determines whether the task is a summary task.")
  public Boolean isSummary() {
    return summary;
  }

  public void setSummary(Boolean summary) {
    this.summary = summary;
  }

  public ResourceAssignment sv(Double sv) {
    this.sv = sv;
    return this;
  }

   /**
   * Returns or sets the earned value schedule variance, through the project status date.
   * @return sv
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the earned value schedule variance, through the project status date.")
  public Double getSv() {
    return sv;
  }

  public void setSv(Double sv) {
    this.sv = sv;
  }

  public ResourceAssignment units(Double units) {
    this.units = units;
    return this;
  }

   /**
   * Returns or sets the number of units for an assignment.
   * @return units
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the number of units for an assignment.")
  public Double getUnits() {
    return units;
  }

  public void setUnits(Double units) {
    this.units = units;
  }

  public ResourceAssignment updateNeeded(Boolean updateNeeded) {
    this.updateNeeded = updateNeeded;
    return this;
  }

   /**
   * Determines whether the resource assigned to a task needs to be updated as to the status of the task.
   * @return updateNeeded
  **/
  @ApiModelProperty(required = true, value = "Determines whether the resource assigned to a task needs to be updated as to the status of the task.")
  public Boolean isUpdateNeeded() {
    return updateNeeded;
  }

  public void setUpdateNeeded(Boolean updateNeeded) {
    this.updateNeeded = updateNeeded;
  }

  public ResourceAssignment vac(Double vac) {
    this.vac = vac;
    return this;
  }

   /**
   * Returns or sets the difference between basline cost and total cost. Read/write Double.
   * @return vac
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the difference between basline cost and total cost. Read/write Double.")
  public Double getVac() {
    return vac;
  }

  public void setVac(Double vac) {
    this.vac = vac;
  }

  public ResourceAssignment work(String work) {
    this.work = work;
    return this;
  }

   /**
   * Returns or sets the amount of scheduled work for an assignment. Read/write TimeSpan.
   * @return work
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the amount of scheduled work for an assignment. Read/write TimeSpan.")
  public String getWork() {
    return work;
  }

  public void setWork(String work) {
    this.work = work;
  }

  public ResourceAssignment workContour(WorkContourType workContour) {
    this.workContour = workContour;
    return this;
  }

   /**
   * Returns or sets the work contour of an assignment.
   * @return workContour
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the work contour of an assignment.")
  public WorkContourType getWorkContour() {
    return workContour;
  }

  public void setWorkContour(WorkContourType workContour) {
    this.workContour = workContour;
  }

  public ResourceAssignment bcws(Double bcws) {
    this.bcws = bcws;
    return this;
  }

   /**
   * Returns or sets the budgeted cost of a work on assignment.
   * @return bcws
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the budgeted cost of a work on assignment.")
  public Double getBcws() {
    return bcws;
  }

  public void setBcws(Double bcws) {
    this.bcws = bcws;
  }

  public ResourceAssignment bcwp(Double bcwp) {
    this.bcwp = bcwp;
    return this;
  }

   /**
   * Returns or sets the budgeted cost of a work performed on assignment to-date.
   * @return bcwp
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the budgeted cost of a work performed on assignment to-date.")
  public Double getBcwp() {
    return bcwp;
  }

  public void setBcwp(Double bcwp) {
    this.bcwp = bcwp;
  }

  public ResourceAssignment bookingType(BookingType bookingType) {
    this.bookingType = bookingType;
    return this;
  }

   /**
   * Returns or sets the booking type of an assignment.
   * @return bookingType
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the booking type of an assignment.")
  public BookingType getBookingType() {
    return bookingType;
  }

  public void setBookingType(BookingType bookingType) {
    this.bookingType = bookingType;
  }

  public ResourceAssignment actualWorkProtected(String actualWorkProtected) {
    this.actualWorkProtected = actualWorkProtected;
    return this;
  }

   /**
   * Returns or sets the duration through which actual work is protected.
   * @return actualWorkProtected
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the duration through which actual work is protected.")
  public String getActualWorkProtected() {
    return actualWorkProtected;
  }

  public void setActualWorkProtected(String actualWorkProtected) {
    this.actualWorkProtected = actualWorkProtected;
  }

  public ResourceAssignment actualOvertimeWorkProtected(String actualOvertimeWorkProtected) {
    this.actualOvertimeWorkProtected = actualOvertimeWorkProtected;
    return this;
  }

   /**
   * Returns or sets the duration through which actual overtime work is protected.
   * @return actualOvertimeWorkProtected
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the duration through which actual overtime work is protected.")
  public String getActualOvertimeWorkProtected() {
    return actualOvertimeWorkProtected;
  }

  public void setActualOvertimeWorkProtected(String actualOvertimeWorkProtected) {
    this.actualOvertimeWorkProtected = actualOvertimeWorkProtected;
  }

  public ResourceAssignment creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Returns or sets the date that the assignment was created.
   * @return creationDate
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the date that the assignment was created.")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public ResourceAssignment assnOwner(String assnOwner) {
    this.assnOwner = assnOwner;
    return this;
  }

   /**
   * Returns or sets the name of an assignment owner.
   * @return assnOwner
  **/
  @ApiModelProperty(value = "Returns or sets the name of an assignment owner.")
  public String getAssnOwner() {
    return assnOwner;
  }

  public void setAssnOwner(String assnOwner) {
    this.assnOwner = assnOwner;
  }

  public ResourceAssignment assnOwnerGuid(String assnOwnerGuid) {
    this.assnOwnerGuid = assnOwnerGuid;
    return this;
  }

   /**
   * Returns or sets the Guid of an assignment owner.
   * @return assnOwnerGuid
  **/
  @ApiModelProperty(value = "Returns or sets the Guid of an assignment owner.")
  public String getAssnOwnerGuid() {
    return assnOwnerGuid;
  }

  public void setAssnOwnerGuid(String assnOwnerGuid) {
    this.assnOwnerGuid = assnOwnerGuid;
  }

  public ResourceAssignment budgetCost(BigDecimal budgetCost) {
    this.budgetCost = budgetCost;
    return this;
  }

   /**
   * Returns or sets the budgeted cost of resources on an assignment.
   * @return budgetCost
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the budgeted cost of resources on an assignment.")
  public BigDecimal getBudgetCost() {
    return budgetCost;
  }

  public void setBudgetCost(BigDecimal budgetCost) {
    this.budgetCost = budgetCost;
  }

  public ResourceAssignment budgetWork(String budgetWork) {
    this.budgetWork = budgetWork;
    return this;
  }

   /**
   * Returns or sets the budgeted work amount for a work or material resources on an assignment.
   * @return budgetWork
  **/
  @ApiModelProperty(required = true, value = "Returns or sets the budgeted work amount for a work or material resources on an assignment.")
  public String getBudgetWork() {
    return budgetWork;
  }

  public void setBudgetWork(String budgetWork) {
    this.budgetWork = budgetWork;
  }

  public ResourceAssignment rateScale(RateScaleType rateScale) {
    this.rateScale = rateScale;
    return this;
  }

   /**
   * Returns the time unit for the usage rate of the material resource assignment.
   * @return rateScale
  **/
  @ApiModelProperty(required = true, value = "Returns the time unit for the usage rate of the material resource assignment.")
  public RateScaleType getRateScale() {
    return rateScale;
  }

  public void setRateScale(RateScaleType rateScale) {
    this.rateScale = rateScale;
  }

  public ResourceAssignment baselines(List<AssignmentBaseline> baselines) {
    this.baselines = baselines;
    return this;
  }

  public ResourceAssignment addBaselinesItem(AssignmentBaseline baselinesItem) {
    if (this.baselines == null) {
      this.baselines = new ArrayList<AssignmentBaseline>();
    }
    this.baselines.add(baselinesItem);
    return this;
  }

   /**
   * List of ResourceAssignment&#39;s Baseline values.
   * @return baselines
  **/
  @ApiModelProperty(value = "List of ResourceAssignment's Baseline values.")
  public List<AssignmentBaseline> getBaselines() {
    return baselines;
  }

  public void setBaselines(List<AssignmentBaseline> baselines) {
    this.baselines = baselines;
  }

  public ResourceAssignment extendedAttributes(List<ExtendedAttribute> extendedAttributes) {
    this.extendedAttributes = extendedAttributes;
    return this;
  }

  public ResourceAssignment addExtendedAttributesItem(ExtendedAttribute extendedAttributesItem) {
    if (this.extendedAttributes == null) {
      this.extendedAttributes = new ArrayList<ExtendedAttribute>();
    }
    this.extendedAttributes.add(extendedAttributesItem);
    return this;
  }

   /**
   * ResourceAssignment extended attributes.
   * @return extendedAttributes
  **/
  @ApiModelProperty(value = "ResourceAssignment extended attributes.")
  public List<ExtendedAttribute> getExtendedAttributes() {
    return extendedAttributes;
  }

  public void setExtendedAttributes(List<ExtendedAttribute> extendedAttributes) {
    this.extendedAttributes = extendedAttributes;
  }

  public ResourceAssignment timephasedData(List<TimephasedData> timephasedData) {
    this.timephasedData = timephasedData;
    return this;
  }

  public ResourceAssignment addTimephasedDataItem(TimephasedData timephasedDataItem) {
    if (this.timephasedData == null) {
      this.timephasedData = new ArrayList<TimephasedData>();
    }
    this.timephasedData.add(timephasedDataItem);
    return this;
  }

   /**
   * Represents a collection of TimephasedData objects.
   * @return timephasedData
  **/
  @ApiModelProperty(value = "Represents a collection of TimephasedData objects.")
  public List<TimephasedData> getTimephasedData() {
    return timephasedData;
  }

  public void setTimephasedData(List<TimephasedData> timephasedData) {
    this.timephasedData = timephasedData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceAssignment resourceAssignment = (ResourceAssignment) o;
    return Objects.equals(this.taskUid, resourceAssignment.taskUid) &&
        Objects.equals(this.resourceUid, resourceAssignment.resourceUid) &&
        Objects.equals(this.guid, resourceAssignment.guid) &&
        Objects.equals(this.uid, resourceAssignment.uid) &&
        Objects.equals(this.percentWorkComplete, resourceAssignment.percentWorkComplete) &&
        Objects.equals(this.actualCost, resourceAssignment.actualCost) &&
        Objects.equals(this.actualFinish, resourceAssignment.actualFinish) &&
        Objects.equals(this.actualOvertimeCost, resourceAssignment.actualOvertimeCost) &&
        Objects.equals(this.actualOvertimeWork, resourceAssignment.actualOvertimeWork) &&
        Objects.equals(this.actualStart, resourceAssignment.actualStart) &&
        Objects.equals(this.actualWork, resourceAssignment.actualWork) &&
        Objects.equals(this.acwp, resourceAssignment.acwp) &&
        Objects.equals(this.confirmed, resourceAssignment.confirmed) &&
        Objects.equals(this.cost, resourceAssignment.cost) &&
        Objects.equals(this.costRateTableType, resourceAssignment.costRateTableType) &&
        Objects.equals(this.costVariance, resourceAssignment.costVariance) &&
        Objects.equals(this.cv, resourceAssignment.cv) &&
        Objects.equals(this.delay, resourceAssignment.delay) &&
        Objects.equals(this.finish, resourceAssignment.finish) &&
        Objects.equals(this.finishVariance, resourceAssignment.finishVariance) &&
        Objects.equals(this.hyperlink, resourceAssignment.hyperlink) &&
        Objects.equals(this.hyperlinkAddress, resourceAssignment.hyperlinkAddress) &&
        Objects.equals(this.hyperlinkSubAddress, resourceAssignment.hyperlinkSubAddress) &&
        Objects.equals(this.workVariance, resourceAssignment.workVariance) &&
        Objects.equals(this.hasFixedRateUnits, resourceAssignment.hasFixedRateUnits) &&
        Objects.equals(this.fixedMaterial, resourceAssignment.fixedMaterial) &&
        Objects.equals(this.levelingDelay, resourceAssignment.levelingDelay) &&
        Objects.equals(this.levelingDelayFormat, resourceAssignment.levelingDelayFormat) &&
        Objects.equals(this.linkedFields, resourceAssignment.linkedFields) &&
        Objects.equals(this.milestone, resourceAssignment.milestone) &&
        Objects.equals(this.notes, resourceAssignment.notes) &&
        Objects.equals(this.overallocated, resourceAssignment.overallocated) &&
        Objects.equals(this.overtimeCost, resourceAssignment.overtimeCost) &&
        Objects.equals(this.overtimeWork, resourceAssignment.overtimeWork) &&
        Objects.equals(this.peakUnits, resourceAssignment.peakUnits) &&
        Objects.equals(this.regularWork, resourceAssignment.regularWork) &&
        Objects.equals(this.remainingCost, resourceAssignment.remainingCost) &&
        Objects.equals(this.remainingOvertimeCost, resourceAssignment.remainingOvertimeCost) &&
        Objects.equals(this.remainingOvertimeWork, resourceAssignment.remainingOvertimeWork) &&
        Objects.equals(this.remainingWork, resourceAssignment.remainingWork) &&
        Objects.equals(this.responsePending, resourceAssignment.responsePending) &&
        Objects.equals(this.start, resourceAssignment.start) &&
        Objects.equals(this.stop, resourceAssignment.stop) &&
        Objects.equals(this.resume, resourceAssignment.resume) &&
        Objects.equals(this.startVariance, resourceAssignment.startVariance) &&
        Objects.equals(this.summary, resourceAssignment.summary) &&
        Objects.equals(this.sv, resourceAssignment.sv) &&
        Objects.equals(this.units, resourceAssignment.units) &&
        Objects.equals(this.updateNeeded, resourceAssignment.updateNeeded) &&
        Objects.equals(this.vac, resourceAssignment.vac) &&
        Objects.equals(this.work, resourceAssignment.work) &&
        Objects.equals(this.workContour, resourceAssignment.workContour) &&
        Objects.equals(this.bcws, resourceAssignment.bcws) &&
        Objects.equals(this.bcwp, resourceAssignment.bcwp) &&
        Objects.equals(this.bookingType, resourceAssignment.bookingType) &&
        Objects.equals(this.actualWorkProtected, resourceAssignment.actualWorkProtected) &&
        Objects.equals(this.actualOvertimeWorkProtected, resourceAssignment.actualOvertimeWorkProtected) &&
        Objects.equals(this.creationDate, resourceAssignment.creationDate) &&
        Objects.equals(this.assnOwner, resourceAssignment.assnOwner) &&
        Objects.equals(this.assnOwnerGuid, resourceAssignment.assnOwnerGuid) &&
        Objects.equals(this.budgetCost, resourceAssignment.budgetCost) &&
        Objects.equals(this.budgetWork, resourceAssignment.budgetWork) &&
        Objects.equals(this.rateScale, resourceAssignment.rateScale) &&
        Objects.equals(this.baselines, resourceAssignment.baselines) &&
        Objects.equals(this.extendedAttributes, resourceAssignment.extendedAttributes) &&
        Objects.equals(this.timephasedData, resourceAssignment.timephasedData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskUid, resourceUid, guid, uid, percentWorkComplete, actualCost, actualFinish, actualOvertimeCost, actualOvertimeWork, actualStart, actualWork, acwp, confirmed, cost, costRateTableType, costVariance, cv, delay, finish, finishVariance, hyperlink, hyperlinkAddress, hyperlinkSubAddress, workVariance, hasFixedRateUnits, fixedMaterial, levelingDelay, levelingDelayFormat, linkedFields, milestone, notes, overallocated, overtimeCost, overtimeWork, peakUnits, regularWork, remainingCost, remainingOvertimeCost, remainingOvertimeWork, remainingWork, responsePending, start, stop, resume, startVariance, summary, sv, units, updateNeeded, vac, work, workContour, bcws, bcwp, bookingType, actualWorkProtected, actualOvertimeWorkProtected, creationDate, assnOwner, assnOwnerGuid, budgetCost, budgetWork, rateScale, baselines, extendedAttributes, timephasedData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceAssignment {\n");
    
    sb.append("    taskUid: ").append(toIndentedString(taskUid)).append("\n");
    sb.append("    resourceUid: ").append(toIndentedString(resourceUid)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    percentWorkComplete: ").append(toIndentedString(percentWorkComplete)).append("\n");
    sb.append("    actualCost: ").append(toIndentedString(actualCost)).append("\n");
    sb.append("    actualFinish: ").append(toIndentedString(actualFinish)).append("\n");
    sb.append("    actualOvertimeCost: ").append(toIndentedString(actualOvertimeCost)).append("\n");
    sb.append("    actualOvertimeWork: ").append(toIndentedString(actualOvertimeWork)).append("\n");
    sb.append("    actualStart: ").append(toIndentedString(actualStart)).append("\n");
    sb.append("    actualWork: ").append(toIndentedString(actualWork)).append("\n");
    sb.append("    acwp: ").append(toIndentedString(acwp)).append("\n");
    sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    costRateTableType: ").append(toIndentedString(costRateTableType)).append("\n");
    sb.append("    costVariance: ").append(toIndentedString(costVariance)).append("\n");
    sb.append("    cv: ").append(toIndentedString(cv)).append("\n");
    sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
    sb.append("    finish: ").append(toIndentedString(finish)).append("\n");
    sb.append("    finishVariance: ").append(toIndentedString(finishVariance)).append("\n");
    sb.append("    hyperlink: ").append(toIndentedString(hyperlink)).append("\n");
    sb.append("    hyperlinkAddress: ").append(toIndentedString(hyperlinkAddress)).append("\n");
    sb.append("    hyperlinkSubAddress: ").append(toIndentedString(hyperlinkSubAddress)).append("\n");
    sb.append("    workVariance: ").append(toIndentedString(workVariance)).append("\n");
    sb.append("    hasFixedRateUnits: ").append(toIndentedString(hasFixedRateUnits)).append("\n");
    sb.append("    fixedMaterial: ").append(toIndentedString(fixedMaterial)).append("\n");
    sb.append("    levelingDelay: ").append(toIndentedString(levelingDelay)).append("\n");
    sb.append("    levelingDelayFormat: ").append(toIndentedString(levelingDelayFormat)).append("\n");
    sb.append("    linkedFields: ").append(toIndentedString(linkedFields)).append("\n");
    sb.append("    milestone: ").append(toIndentedString(milestone)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    overallocated: ").append(toIndentedString(overallocated)).append("\n");
    sb.append("    overtimeCost: ").append(toIndentedString(overtimeCost)).append("\n");
    sb.append("    overtimeWork: ").append(toIndentedString(overtimeWork)).append("\n");
    sb.append("    peakUnits: ").append(toIndentedString(peakUnits)).append("\n");
    sb.append("    regularWork: ").append(toIndentedString(regularWork)).append("\n");
    sb.append("    remainingCost: ").append(toIndentedString(remainingCost)).append("\n");
    sb.append("    remainingOvertimeCost: ").append(toIndentedString(remainingOvertimeCost)).append("\n");
    sb.append("    remainingOvertimeWork: ").append(toIndentedString(remainingOvertimeWork)).append("\n");
    sb.append("    remainingWork: ").append(toIndentedString(remainingWork)).append("\n");
    sb.append("    responsePending: ").append(toIndentedString(responsePending)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
    sb.append("    resume: ").append(toIndentedString(resume)).append("\n");
    sb.append("    startVariance: ").append(toIndentedString(startVariance)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    sv: ").append(toIndentedString(sv)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    updateNeeded: ").append(toIndentedString(updateNeeded)).append("\n");
    sb.append("    vac: ").append(toIndentedString(vac)).append("\n");
    sb.append("    work: ").append(toIndentedString(work)).append("\n");
    sb.append("    workContour: ").append(toIndentedString(workContour)).append("\n");
    sb.append("    bcws: ").append(toIndentedString(bcws)).append("\n");
    sb.append("    bcwp: ").append(toIndentedString(bcwp)).append("\n");
    sb.append("    bookingType: ").append(toIndentedString(bookingType)).append("\n");
    sb.append("    actualWorkProtected: ").append(toIndentedString(actualWorkProtected)).append("\n");
    sb.append("    actualOvertimeWorkProtected: ").append(toIndentedString(actualOvertimeWorkProtected)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    assnOwner: ").append(toIndentedString(assnOwner)).append("\n");
    sb.append("    assnOwnerGuid: ").append(toIndentedString(assnOwnerGuid)).append("\n");
    sb.append("    budgetCost: ").append(toIndentedString(budgetCost)).append("\n");
    sb.append("    budgetWork: ").append(toIndentedString(budgetWork)).append("\n");
    sb.append("    rateScale: ").append(toIndentedString(rateScale)).append("\n");
    sb.append("    baselines: ").append(toIndentedString(baselines)).append("\n");
    sb.append("    extendedAttributes: ").append(toIndentedString(extendedAttributes)).append("\n");
    sb.append("    timephasedData: ").append(toIndentedString(timephasedData)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


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
import com.aspose.tasks.cloud.model.ConstraintType;
import com.aspose.tasks.cloud.model.CostAccrualType;
import com.aspose.tasks.cloud.model.EarnedValueMethodType;
import com.aspose.tasks.cloud.model.ExtendedAttribute;
import com.aspose.tasks.cloud.model.OutlineCode;
import com.aspose.tasks.cloud.model.TaskBaseline;
import com.aspose.tasks.cloud.model.TaskType;
import com.aspose.tasks.cloud.model.TimeUnitType;
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
 * Represents project task.
 */
@ApiModel(description = "Represents project task.")

public class Task {
  @SerializedName("Uid")
  private Integer uid = null;

  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("DurationText")
  private String durationText = null;

  @SerializedName("Duration")
  private String duration = null;

  @SerializedName("Start")
  private OffsetDateTime start = null;

  @SerializedName("Finish")
  private OffsetDateTime finish = null;

  @SerializedName("StartText")
  private String startText = null;

  @SerializedName("FinishText")
  private String finishText = null;

  @SerializedName("PercentComplete")
  private Integer percentComplete = null;

  @SerializedName("PercentWorkComplete")
  private Integer percentWorkComplete = null;

  @SerializedName("IsActive")
  private Boolean isActive = true;

  @SerializedName("ActualCost")
  private BigDecimal actualCost = null;

  @SerializedName("ActualDuration")
  private String actualDuration = null;

  @SerializedName("ActualFinish")
  private OffsetDateTime actualFinish = null;

  @SerializedName("ActualOvertimeCost")
  private BigDecimal actualOvertimeCost = null;

  @SerializedName("ActualOvertimeWork")
  private String actualOvertimeWork = null;

  @SerializedName("ActualWorkProtected")
  private String actualWorkProtected = null;

  @SerializedName("ActualOvertimeWorkProtected")
  private String actualOvertimeWorkProtected = null;

  @SerializedName("ActualStart")
  private OffsetDateTime actualStart = null;

  @SerializedName("BudgetWork")
  private String budgetWork = null;

  @SerializedName("BudgetCost")
  private BigDecimal budgetCost = null;

  @SerializedName("ConstraintDate")
  private OffsetDateTime constraintDate = null;

  @SerializedName("ConstraintType")
  private ConstraintType constraintType = null;

  @SerializedName("Contact")
  private String contact = null;

  @SerializedName("Cost")
  private BigDecimal cost = null;

  @SerializedName("Cv")
  private Double cv = null;

  @SerializedName("Deadline")
  private OffsetDateTime deadline = null;

  @SerializedName("DurationVariance")
  private String durationVariance = null;

  @SerializedName("EarlyFinish")
  private OffsetDateTime earlyFinish = null;

  @SerializedName("EarlyStart")
  private OffsetDateTime earlyStart = null;

  @SerializedName("IsEffortDriven")
  private Boolean isEffortDriven = null;

  @SerializedName("IsExternalTask")
  private Boolean isExternalTask = null;

  @SerializedName("ExternalTaskProject")
  private String externalTaskProject = null;

  @SerializedName("ExternalId")
  private Integer externalId = null;

  @SerializedName("FinishSlack")
  private Integer finishSlack = null;

  @SerializedName("FinishVariance")
  private Integer finishVariance = null;

  @SerializedName("FixedCost")
  private Double fixedCost = null;

  @SerializedName("FixedCostAccrual")
  private CostAccrualType fixedCostAccrual = null;

  @SerializedName("FreeSlack")
  private Integer freeSlack = null;

  @SerializedName("Guid")
  private String guid = null;

  @SerializedName("HasOverallocatedResource")
  private Boolean hasOverallocatedResource = null;

  @SerializedName("HideBar")
  private Boolean hideBar = null;

  @SerializedName("IgnoreResourceCalendar")
  private Boolean ignoreResourceCalendar = null;

  @SerializedName("LateFinish")
  private OffsetDateTime lateFinish = null;

  @SerializedName("LateStart")
  private OffsetDateTime lateStart = null;

  @SerializedName("IsLevelAssignments")
  private Boolean isLevelAssignments = true;

  @SerializedName("CanLevelingSplit")
  private Boolean canLevelingSplit = true;

  @SerializedName("LevelingDelay")
  private Integer levelingDelay = null;

  @SerializedName("IsMarked")
  private Boolean isMarked = null;

  @SerializedName("IsMilestone")
  private Boolean isMilestone = null;

  @SerializedName("IsCritical")
  private Boolean isCritical = null;

  @SerializedName("IsSubproject")
  private Boolean isSubproject = null;

  @SerializedName("IsSubprojectReadOnly")
  private Boolean isSubprojectReadOnly = null;

  @SerializedName("SubprojectName")
  private String subprojectName = null;

  @SerializedName("IsSummary")
  private Boolean isSummary = null;

  @SerializedName("SubtasksUids")
  private List<Integer> subtasksUids = null;

  @SerializedName("OutlineLevel")
  private Integer outlineLevel = null;

  @SerializedName("IsOverAllocated")
  private Boolean isOverAllocated = null;

  @SerializedName("IsEstimated")
  private Boolean isEstimated = null;

  @SerializedName("OvertimeCost")
  private BigDecimal overtimeCost = null;

  @SerializedName("OvertimeWork")
  private String overtimeWork = null;

  @SerializedName("PhysicalPercentComplete")
  private Integer physicalPercentComplete = null;

  @SerializedName("PreLeveledFinish")
  private OffsetDateTime preLeveledFinish = null;

  @SerializedName("PreLeveledStart")
  private OffsetDateTime preLeveledStart = null;

  @SerializedName("IsRecurring")
  private Boolean isRecurring = null;

  @SerializedName("RegularWork")
  private String regularWork = null;

  @SerializedName("RemainingCost")
  private BigDecimal remainingCost = null;

  @SerializedName("RemainingDuration")
  private String remainingDuration = null;

  @SerializedName("RemainingOvertimeCost")
  private BigDecimal remainingOvertimeCost = null;

  @SerializedName("RemainingOvertimeWork")
  private String remainingOvertimeWork = null;

  @SerializedName("RemainingWork")
  private String remainingWork = null;

  @SerializedName("Resume")
  private OffsetDateTime resume = null;

  @SerializedName("IsResumeValid")
  private Boolean isResumeValid = null;

  @SerializedName("Stop")
  private OffsetDateTime stop = null;

  @SerializedName("IsRollup")
  private Boolean isRollup = null;

  @SerializedName("StartSlack")
  private Integer startSlack = null;

  @SerializedName("StartVariance")
  private Integer startVariance = null;

  @SerializedName("CalendarUid")
  private Integer calendarUid = -1;

  @SerializedName("IsManual")
  private Boolean isManual = null;

  @SerializedName("ManualStart")
  private OffsetDateTime manualStart = null;

  @SerializedName("ManualFinish")
  private OffsetDateTime manualFinish = null;

  @SerializedName("ManualDuration")
  private String manualDuration = null;

  @SerializedName("TotalSlack")
  private Integer totalSlack = null;

  @SerializedName("Type")
  private TaskType type = null;

  @SerializedName("Wbs")
  private String wbs = null;

  @SerializedName("Priority")
  private Integer priority = null;

  @SerializedName("Work")
  private String work = null;

  @SerializedName("WorkVariance")
  private Double workVariance = null;

  @SerializedName("NotesText")
  private String notesText = null;

  @SerializedName("NotesRTF")
  private String notesRTF = null;

  @SerializedName("Acwp")
  private Double acwp = null;

  @SerializedName("Bcws")
  private Double bcws = null;

  @SerializedName("Bcwp")
  private Double bcwp = null;

  @SerializedName("LevelingDelayFormat")
  private TimeUnitType levelingDelayFormat = null;

  @SerializedName("Predecessors")
  private String predecessors = null;

  @SerializedName("Successors")
  private String successors = null;

  @SerializedName("IgnoreWarnings")
  private Boolean ignoreWarnings = false;

  @SerializedName("IsExpanded")
  private Boolean isExpanded = null;

  @SerializedName("DisplayOnTimeline")
  private Boolean displayOnTimeline = null;

  @SerializedName("DisplayAsSummary")
  private Boolean displayAsSummary = null;

  @SerializedName("Hyperlink")
  private String hyperlink = null;

  @SerializedName("HyperlinkAddress")
  private String hyperlinkAddress = null;

  @SerializedName("HyperlinkSubAddress")
  private String hyperlinkSubAddress = null;

  @SerializedName("EarnedValueMethod")
  private EarnedValueMethodType earnedValueMethod = null;

  @SerializedName("IsPublished")
  private Boolean isPublished = true;

  @SerializedName("StatusManager")
  private String statusManager = null;

  @SerializedName("CommitmentStart")
  private OffsetDateTime commitmentStart = null;

  @SerializedName("CommitmentFinish")
  private OffsetDateTime commitmentFinish = null;

  @SerializedName("CommitmentType")
  private Integer commitmentType = null;

  @SerializedName("Baselines")
  private List<TaskBaseline> baselines = null;

  @SerializedName("ExtendedAttributes")
  private List<ExtendedAttribute> extendedAttributes = null;

  @SerializedName("OutlineCodes")
  private List<OutlineCode> outlineCodes = null;

  @SerializedName("Warning")
  private Boolean warning = false;

  @SerializedName("ActivityId")
  private String activityId = null;

  public Task uid(Integer uid) {
    this.uid = uid;
    return this;
  }

   /**
   * The unique id of a task.
   * @return uid
  **/
  @ApiModelProperty(required = true, value = "The unique id of a task.")
  public Integer getUid() {
    return uid;
  }

  public void setUid(Integer uid) {
    this.uid = uid;
  }

  public Task id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The position of a task in collection.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The position of a task in collection.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Task name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of a task.
   * @return name
  **/
  @ApiModelProperty(value = "The name of a task.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Task durationText(String durationText) {
    this.durationText = durationText;
    return this;
  }

   /**
   * The duration of a task entered by the user as a text.
   * @return durationText
  **/
  @ApiModelProperty(value = "The duration of a task entered by the user as a text.")
  public String getDurationText() {
    return durationText;
  }

  public void setDurationText(String durationText) {
    this.durationText = durationText;
  }

  public Task duration(String duration) {
    this.duration = duration;
    return this;
  }

   /**
   * The duration of a task.
   * @return duration
  **/
  @ApiModelProperty(required = true, value = "The duration of a task.")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public Task start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * The start date of a task.
   * @return start
  **/
  @ApiModelProperty(required = true, value = "The start date of a task.")
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  public Task finish(OffsetDateTime finish) {
    this.finish = finish;
    return this;
  }

   /**
   * The finish date of a task.
   * @return finish
  **/
  @ApiModelProperty(required = true, value = "The finish date of a task.")
  public OffsetDateTime getFinish() {
    return finish;
  }

  public void setFinish(OffsetDateTime finish) {
    this.finish = finish;
  }

  public Task startText(String startText) {
    this.startText = startText;
    return this;
  }

   /**
   * Returns the task&#39;s start text.
   * @return startText
  **/
  @ApiModelProperty(value = "Returns the task's start text.")
  public String getStartText() {
    return startText;
  }

  public void setStartText(String startText) {
    this.startText = startText;
  }

  public Task finishText(String finishText) {
    this.finishText = finishText;
    return this;
  }

   /**
   * Returns the task&#39;s finish text.
   * @return finishText
  **/
  @ApiModelProperty(value = "Returns the task's finish text.")
  public String getFinishText() {
    return finishText;
  }

  public void setFinishText(String finishText) {
    this.finishText = finishText;
  }

  public Task percentComplete(Integer percentComplete) {
    this.percentComplete = percentComplete;
    return this;
  }

   /**
   * The percent complete of a task.
   * @return percentComplete
  **/
  @ApiModelProperty(required = true, value = "The percent complete of a task.")
  public Integer getPercentComplete() {
    return percentComplete;
  }

  public void setPercentComplete(Integer percentComplete) {
    this.percentComplete = percentComplete;
  }

  public Task percentWorkComplete(Integer percentWorkComplete) {
    this.percentWorkComplete = percentWorkComplete;
    return this;
  }

   /**
   * The percent work complete of a task.
   * @return percentWorkComplete
  **/
  @ApiModelProperty(required = true, value = "The percent work complete of a task.")
  public Integer getPercentWorkComplete() {
    return percentWorkComplete;
  }

  public void setPercentWorkComplete(Integer percentWorkComplete) {
    this.percentWorkComplete = percentWorkComplete;
  }

  public Task isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Determines if a task is active.
   * @return isActive
  **/
  @ApiModelProperty(required = true, value = "Determines if a task is active.")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public Task actualCost(BigDecimal actualCost) {
    this.actualCost = actualCost;
    return this;
  }

   /**
   * The actual cost of a task.
   * @return actualCost
  **/
  @ApiModelProperty(required = true, value = "The actual cost of a task.")
  public BigDecimal getActualCost() {
    return actualCost;
  }

  public void setActualCost(BigDecimal actualCost) {
    this.actualCost = actualCost;
  }

  public Task actualDuration(String actualDuration) {
    this.actualDuration = actualDuration;
    return this;
  }

   /**
   * The actual duration of a task.
   * @return actualDuration
  **/
  @ApiModelProperty(required = true, value = "The actual duration of a task.")
  public String getActualDuration() {
    return actualDuration;
  }

  public void setActualDuration(String actualDuration) {
    this.actualDuration = actualDuration;
  }

  public Task actualFinish(OffsetDateTime actualFinish) {
    this.actualFinish = actualFinish;
    return this;
  }

   /**
   * The actual finish date of a task.
   * @return actualFinish
  **/
  @ApiModelProperty(required = true, value = "The actual finish date of a task.")
  public OffsetDateTime getActualFinish() {
    return actualFinish;
  }

  public void setActualFinish(OffsetDateTime actualFinish) {
    this.actualFinish = actualFinish;
  }

  public Task actualOvertimeCost(BigDecimal actualOvertimeCost) {
    this.actualOvertimeCost = actualOvertimeCost;
    return this;
  }

   /**
   * The actual overtime cost of a task.
   * @return actualOvertimeCost
  **/
  @ApiModelProperty(required = true, value = "The actual overtime cost of a task.")
  public BigDecimal getActualOvertimeCost() {
    return actualOvertimeCost;
  }

  public void setActualOvertimeCost(BigDecimal actualOvertimeCost) {
    this.actualOvertimeCost = actualOvertimeCost;
  }

  public Task actualOvertimeWork(String actualOvertimeWork) {
    this.actualOvertimeWork = actualOvertimeWork;
    return this;
  }

   /**
   * The actual overtime work of a task.
   * @return actualOvertimeWork
  **/
  @ApiModelProperty(required = true, value = "The actual overtime work of a task.")
  public String getActualOvertimeWork() {
    return actualOvertimeWork;
  }

  public void setActualOvertimeWork(String actualOvertimeWork) {
    this.actualOvertimeWork = actualOvertimeWork;
  }

  public Task actualWorkProtected(String actualWorkProtected) {
    this.actualWorkProtected = actualWorkProtected;
    return this;
  }

   /**
   * The duration through which actual work is protected. Reading supported for XML format only.
   * @return actualWorkProtected
  **/
  @ApiModelProperty(required = true, value = "The duration through which actual work is protected. Reading supported for XML format only.")
  public String getActualWorkProtected() {
    return actualWorkProtected;
  }

  public void setActualWorkProtected(String actualWorkProtected) {
    this.actualWorkProtected = actualWorkProtected;
  }

  public Task actualOvertimeWorkProtected(String actualOvertimeWorkProtected) {
    this.actualOvertimeWorkProtected = actualOvertimeWorkProtected;
    return this;
  }

   /**
   * The duration through which actual overtime work is protected. Reading supported for XML format only.
   * @return actualOvertimeWorkProtected
  **/
  @ApiModelProperty(required = true, value = "The duration through which actual overtime work is protected. Reading supported for XML format only.")
  public String getActualOvertimeWorkProtected() {
    return actualOvertimeWorkProtected;
  }

  public void setActualOvertimeWorkProtected(String actualOvertimeWorkProtected) {
    this.actualOvertimeWorkProtected = actualOvertimeWorkProtected;
  }

  public Task actualStart(OffsetDateTime actualStart) {
    this.actualStart = actualStart;
    return this;
  }

   /**
   * The actual start date of a task.
   * @return actualStart
  **/
  @ApiModelProperty(required = true, value = "The actual start date of a task.")
  public OffsetDateTime getActualStart() {
    return actualStart;
  }

  public void setActualStart(OffsetDateTime actualStart) {
    this.actualStart = actualStart;
  }

  public Task budgetWork(String budgetWork) {
    this.budgetWork = budgetWork;
    return this;
  }

   /**
   * The amount of budgeted work for a project root task.
   * @return budgetWork
  **/
  @ApiModelProperty(required = true, value = "The amount of budgeted work for a project root task.")
  public String getBudgetWork() {
    return budgetWork;
  }

  public void setBudgetWork(String budgetWork) {
    this.budgetWork = budgetWork;
  }

  public Task budgetCost(BigDecimal budgetCost) {
    this.budgetCost = budgetCost;
    return this;
  }

   /**
   * The amount of budgeted cost for a project root task.
   * @return budgetCost
  **/
  @ApiModelProperty(required = true, value = "The amount of budgeted cost for a project root task.")
  public BigDecimal getBudgetCost() {
    return budgetCost;
  }

  public void setBudgetCost(BigDecimal budgetCost) {
    this.budgetCost = budgetCost;
  }

  public Task constraintDate(OffsetDateTime constraintDate) {
    this.constraintDate = constraintDate;
    return this;
  }

   /**
   * Shows the specific date associated with certain constraint types,  such as Must Start On, Must Finish On, Start No Earlier Than, Start No Later Than, Finish No Earlier Than, and Finish No Later Than.
   * @return constraintDate
  **/
  @ApiModelProperty(required = true, value = "Shows the specific date associated with certain constraint types,  such as Must Start On, Must Finish On, Start No Earlier Than, Start No Later Than, Finish No Earlier Than, and Finish No Later Than.")
  public OffsetDateTime getConstraintDate() {
    return constraintDate;
  }

  public void setConstraintDate(OffsetDateTime constraintDate) {
    this.constraintDate = constraintDate;
  }

  public Task constraintType(ConstraintType constraintType) {
    this.constraintType = constraintType;
    return this;
  }

   /**
   * Provides choices for the type of constraint that can be applied for scheduling a task.
   * @return constraintType
  **/
  @ApiModelProperty(required = true, value = "Provides choices for the type of constraint that can be applied for scheduling a task.")
  public ConstraintType getConstraintType() {
    return constraintType;
  }

  public void setConstraintType(ConstraintType constraintType) {
    this.constraintType = constraintType;
  }

  public Task contact(String contact) {
    this.contact = contact;
    return this;
  }

   /**
   * The contact person for a task.
   * @return contact
  **/
  @ApiModelProperty(value = "The contact person for a task.")
  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public Task cost(BigDecimal cost) {
    this.cost = cost;
    return this;
  }

   /**
   * The projected or scheduled cost of a task.
   * @return cost
  **/
  @ApiModelProperty(required = true, value = "The projected or scheduled cost of a task.")
  public BigDecimal getCost() {
    return cost;
  }

  public void setCost(BigDecimal cost) {
    this.cost = cost;
  }

  public Task cv(Double cv) {
    this.cv = cv;
    return this;
  }

   /**
   * The difference between the baseline cost and total cost for a task.
   * @return cv
  **/
  @ApiModelProperty(required = true, value = "The difference between the baseline cost and total cost for a task.")
  public Double getCv() {
    return cv;
  }

  public void setCv(Double cv) {
    this.cv = cv;
  }

  public Task deadline(OffsetDateTime deadline) {
    this.deadline = deadline;
    return this;
  }

   /**
   * The deadline for a task to be completed.
   * @return deadline
  **/
  @ApiModelProperty(required = true, value = "The deadline for a task to be completed.")
  public OffsetDateTime getDeadline() {
    return deadline;
  }

  public void setDeadline(OffsetDateTime deadline) {
    this.deadline = deadline;
  }

  public Task durationVariance(String durationVariance) {
    this.durationVariance = durationVariance;
    return this;
  }

   /**
   * Contains the difference between the total duration of a task and the baseline duration of a task.
   * @return durationVariance
  **/
  @ApiModelProperty(required = true, value = "Contains the difference between the total duration of a task and the baseline duration of a task.")
  public String getDurationVariance() {
    return durationVariance;
  }

  public void setDurationVariance(String durationVariance) {
    this.durationVariance = durationVariance;
  }

  public Task earlyFinish(OffsetDateTime earlyFinish) {
    this.earlyFinish = earlyFinish;
    return this;
  }

   /**
   * The early finish date of a task.
   * @return earlyFinish
  **/
  @ApiModelProperty(required = true, value = "The early finish date of a task.")
  public OffsetDateTime getEarlyFinish() {
    return earlyFinish;
  }

  public void setEarlyFinish(OffsetDateTime earlyFinish) {
    this.earlyFinish = earlyFinish;
  }

  public Task earlyStart(OffsetDateTime earlyStart) {
    this.earlyStart = earlyStart;
    return this;
  }

   /**
   * The early start date of a task.
   * @return earlyStart
  **/
  @ApiModelProperty(required = true, value = "The early start date of a task.")
  public OffsetDateTime getEarlyStart() {
    return earlyStart;
  }

  public void setEarlyStart(OffsetDateTime earlyStart) {
    this.earlyStart = earlyStart;
  }

  public Task isEffortDriven(Boolean isEffortDriven) {
    this.isEffortDriven = isEffortDriven;
    return this;
  }

   /**
   * Determines whether a task is effort-driven.
   * @return isEffortDriven
  **/
  @ApiModelProperty(required = true, value = "Determines whether a task is effort-driven.")
  public Boolean isIsEffortDriven() {
    return isEffortDriven;
  }

  public void setIsEffortDriven(Boolean isEffortDriven) {
    this.isEffortDriven = isEffortDriven;
  }

  public Task isExternalTask(Boolean isExternalTask) {
    this.isExternalTask = isExternalTask;
    return this;
  }

   /**
   * Determines whether a task is external.
   * @return isExternalTask
  **/
  @ApiModelProperty(required = true, value = "Determines whether a task is external.")
  public Boolean isIsExternalTask() {
    return isExternalTask;
  }

  public void setIsExternalTask(Boolean isExternalTask) {
    this.isExternalTask = isExternalTask;
  }

  public Task externalTaskProject(String externalTaskProject) {
    this.externalTaskProject = externalTaskProject;
    return this;
  }

   /**
   * The source location and task identifier of an external task.
   * @return externalTaskProject
  **/
  @ApiModelProperty(value = "The source location and task identifier of an external task.")
  public String getExternalTaskProject() {
    return externalTaskProject;
  }

  public void setExternalTaskProject(String externalTaskProject) {
    this.externalTaskProject = externalTaskProject;
  }

  public Task externalId(Integer externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * If a task is an external task the property contains the task&#39;s external Id.  type.
   * @return externalId
  **/
  @ApiModelProperty(required = true, value = "If a task is an external task the property contains the task's external Id.  type.")
  public Integer getExternalId() {
    return externalId;
  }

  public void setExternalId(Integer externalId) {
    this.externalId = externalId;
  }

  public Task finishSlack(Integer finishSlack) {
    this.finishSlack = finishSlack;
    return this;
  }

   /**
   * Contains the duration between the Early Finish and Late Finish dates.
   * @return finishSlack
  **/
  @ApiModelProperty(required = true, value = "Contains the duration between the Early Finish and Late Finish dates.")
  public Integer getFinishSlack() {
    return finishSlack;
  }

  public void setFinishSlack(Integer finishSlack) {
    this.finishSlack = finishSlack;
  }

  public Task finishVariance(Integer finishVariance) {
    this.finishVariance = finishVariance;
    return this;
  }

   /**
   * The variance of the task finish date from the baseline finish date as minutes.
   * @return finishVariance
  **/
  @ApiModelProperty(required = true, value = "The variance of the task finish date from the baseline finish date as minutes.")
  public Integer getFinishVariance() {
    return finishVariance;
  }

  public void setFinishVariance(Integer finishVariance) {
    this.finishVariance = finishVariance;
  }

  public Task fixedCost(Double fixedCost) {
    this.fixedCost = fixedCost;
    return this;
  }

   /**
   * The fixed cost of a task.
   * @return fixedCost
  **/
  @ApiModelProperty(required = true, value = "The fixed cost of a task.")
  public Double getFixedCost() {
    return fixedCost;
  }

  public void setFixedCost(Double fixedCost) {
    this.fixedCost = fixedCost;
  }

  public Task fixedCostAccrual(CostAccrualType fixedCostAccrual) {
    this.fixedCostAccrual = fixedCostAccrual;
    return this;
  }

   /**
   * Determines how the fixed cost is accrued against a task.
   * @return fixedCostAccrual
  **/
  @ApiModelProperty(required = true, value = "Determines how the fixed cost is accrued against a task.")
  public CostAccrualType getFixedCostAccrual() {
    return fixedCostAccrual;
  }

  public void setFixedCostAccrual(CostAccrualType fixedCostAccrual) {
    this.fixedCostAccrual = fixedCostAccrual;
  }

  public Task freeSlack(Integer freeSlack) {
    this.freeSlack = freeSlack;
    return this;
  }

   /**
   * The amount of a free slack.
   * @return freeSlack
  **/
  @ApiModelProperty(required = true, value = "The amount of a free slack.")
  public Integer getFreeSlack() {
    return freeSlack;
  }

  public void setFreeSlack(Integer freeSlack) {
    this.freeSlack = freeSlack;
  }

  public Task guid(String guid) {
    this.guid = guid;
    return this;
  }

   /**
   * Get guid
   * @return guid
  **/
  @ApiModelProperty(value = "")
  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public Task hasOverallocatedResource(Boolean hasOverallocatedResource) {
    this.hasOverallocatedResource = hasOverallocatedResource;
    return this;
  }

   /**
   * Indicates whether the task has an resource assigned which has more work on assigned tasks than can be completed within normal working capacity.
   * @return hasOverallocatedResource
  **/
  @ApiModelProperty(required = true, value = "Indicates whether the task has an resource assigned which has more work on assigned tasks than can be completed within normal working capacity.")
  public Boolean isHasOverallocatedResource() {
    return hasOverallocatedResource;
  }

  public void setHasOverallocatedResource(Boolean hasOverallocatedResource) {
    this.hasOverallocatedResource = hasOverallocatedResource;
  }

  public Task hideBar(Boolean hideBar) {
    this.hideBar = hideBar;
    return this;
  }

   /**
   * Determines whether the GANTT bar of a task is hidden when displayed in Microsoft Project.
   * @return hideBar
  **/
  @ApiModelProperty(required = true, value = "Determines whether the GANTT bar of a task is hidden when displayed in Microsoft Project.")
  public Boolean isHideBar() {
    return hideBar;
  }

  public void setHideBar(Boolean hideBar) {
    this.hideBar = hideBar;
  }

  public Task ignoreResourceCalendar(Boolean ignoreResourceCalendar) {
    this.ignoreResourceCalendar = ignoreResourceCalendar;
    return this;
  }

   /**
   * Determines whether a task ignores the resource calendar.
   * @return ignoreResourceCalendar
  **/
  @ApiModelProperty(required = true, value = "Determines whether a task ignores the resource calendar.")
  public Boolean isIgnoreResourceCalendar() {
    return ignoreResourceCalendar;
  }

  public void setIgnoreResourceCalendar(Boolean ignoreResourceCalendar) {
    this.ignoreResourceCalendar = ignoreResourceCalendar;
  }

  public Task lateFinish(OffsetDateTime lateFinish) {
    this.lateFinish = lateFinish;
    return this;
  }

   /**
   * The late finish date of a task.
   * @return lateFinish
  **/
  @ApiModelProperty(required = true, value = "The late finish date of a task.")
  public OffsetDateTime getLateFinish() {
    return lateFinish;
  }

  public void setLateFinish(OffsetDateTime lateFinish) {
    this.lateFinish = lateFinish;
  }

  public Task lateStart(OffsetDateTime lateStart) {
    this.lateStart = lateStart;
    return this;
  }

   /**
   * The late start date of a task.
   * @return lateStart
  **/
  @ApiModelProperty(required = true, value = "The late start date of a task.")
  public OffsetDateTime getLateStart() {
    return lateStart;
  }

  public void setLateStart(OffsetDateTime lateStart) {
    this.lateStart = lateStart;
  }

  public Task isLevelAssignments(Boolean isLevelAssignments) {
    this.isLevelAssignments = isLevelAssignments;
    return this;
  }

   /**
   * Get isLevelAssignments
   * @return isLevelAssignments
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsLevelAssignments() {
    return isLevelAssignments;
  }

  public void setIsLevelAssignments(Boolean isLevelAssignments) {
    this.isLevelAssignments = isLevelAssignments;
  }

  public Task canLevelingSplit(Boolean canLevelingSplit) {
    this.canLevelingSplit = canLevelingSplit;
    return this;
  }

   /**
   * Get canLevelingSplit
   * @return canLevelingSplit
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isCanLevelingSplit() {
    return canLevelingSplit;
  }

  public void setCanLevelingSplit(Boolean canLevelingSplit) {
    this.canLevelingSplit = canLevelingSplit;
  }

  public Task levelingDelay(Integer levelingDelay) {
    this.levelingDelay = levelingDelay;
    return this;
  }

   /**
   * The delay caused by leveling a task.
   * @return levelingDelay
  **/
  @ApiModelProperty(required = true, value = "The delay caused by leveling a task.")
  public Integer getLevelingDelay() {
    return levelingDelay;
  }

  public void setLevelingDelay(Integer levelingDelay) {
    this.levelingDelay = levelingDelay;
  }

  public Task isMarked(Boolean isMarked) {
    this.isMarked = isMarked;
    return this;
  }

   /**
   * Shows whether a task is marked for further action or identification of some kind.             
   * @return isMarked
  **/
  @ApiModelProperty(required = true, value = "Shows whether a task is marked for further action or identification of some kind.             ")
  public Boolean isIsMarked() {
    return isMarked;
  }

  public void setIsMarked(Boolean isMarked) {
    this.isMarked = isMarked;
  }

  public Task isMilestone(Boolean isMilestone) {
    this.isMilestone = isMilestone;
    return this;
  }

   /**
   * Determines whether a task is a milestone.
   * @return isMilestone
  **/
  @ApiModelProperty(required = true, value = "Determines whether a task is a milestone.")
  public Boolean isIsMilestone() {
    return isMilestone;
  }

  public void setIsMilestone(Boolean isMilestone) {
    this.isMilestone = isMilestone;
  }

  public Task isCritical(Boolean isCritical) {
    this.isCritical = isCritical;
    return this;
  }

   /**
   * Determines whether a task is in the critical chain.
   * @return isCritical
  **/
  @ApiModelProperty(required = true, value = "Determines whether a task is in the critical chain.")
  public Boolean isIsCritical() {
    return isCritical;
  }

  public void setIsCritical(Boolean isCritical) {
    this.isCritical = isCritical;
  }

  public Task isSubproject(Boolean isSubproject) {
    this.isSubproject = isSubproject;
    return this;
  }

   /**
   * Determines whether a task is an inserted project.
   * @return isSubproject
  **/
  @ApiModelProperty(required = true, value = "Determines whether a task is an inserted project.")
  public Boolean isIsSubproject() {
    return isSubproject;
  }

  public void setIsSubproject(Boolean isSubproject) {
    this.isSubproject = isSubproject;
  }

  public Task isSubprojectReadOnly(Boolean isSubprojectReadOnly) {
    this.isSubprojectReadOnly = isSubprojectReadOnly;
    return this;
  }

   /**
   * Determines whether a subproject is read-only.
   * @return isSubprojectReadOnly
  **/
  @ApiModelProperty(required = true, value = "Determines whether a subproject is read-only.")
  public Boolean isIsSubprojectReadOnly() {
    return isSubprojectReadOnly;
  }

  public void setIsSubprojectReadOnly(Boolean isSubprojectReadOnly) {
    this.isSubprojectReadOnly = isSubprojectReadOnly;
  }

  public Task subprojectName(String subprojectName) {
    this.subprojectName = subprojectName;
    return this;
  }

   /**
   * The source location of a subproject. Read/write String.
   * @return subprojectName
  **/
  @ApiModelProperty(value = "The source location of a subproject. Read/write String.")
  public String getSubprojectName() {
    return subprojectName;
  }

  public void setSubprojectName(String subprojectName) {
    this.subprojectName = subprojectName;
  }

  public Task isSummary(Boolean isSummary) {
    this.isSummary = isSummary;
    return this;
  }

   /**
   * Determines whether a task is a summary task.
   * @return isSummary
  **/
  @ApiModelProperty(required = true, value = "Determines whether a task is a summary task.")
  public Boolean isIsSummary() {
    return isSummary;
  }

  public void setIsSummary(Boolean isSummary) {
    this.isSummary = isSummary;
  }

  public Task subtasksUids(List<Integer> subtasksUids) {
    this.subtasksUids = subtasksUids;
    return this;
  }

  public Task addSubtasksUidsItem(Integer subtasksUidsItem) {
    if (this.subtasksUids == null) {
      this.subtasksUids = new ArrayList<Integer>();
    }
    this.subtasksUids.add(subtasksUidsItem);
    return this;
  }

   /**
   * Unique ids of all subtasks.
   * @return subtasksUids
  **/
  @ApiModelProperty(value = "Unique ids of all subtasks.")
  public List<Integer> getSubtasksUids() {
    return subtasksUids;
  }

  public void setSubtasksUids(List<Integer> subtasksUids) {
    this.subtasksUids = subtasksUids;
  }

  public Task outlineLevel(Integer outlineLevel) {
    this.outlineLevel = outlineLevel;
    return this;
  }

   /**
   * The outline level of a task.
   * @return outlineLevel
  **/
  @ApiModelProperty(required = true, value = "The outline level of a task.")
  public Integer getOutlineLevel() {
    return outlineLevel;
  }

  public void setOutlineLevel(Integer outlineLevel) {
    this.outlineLevel = outlineLevel;
  }

  public Task isOverAllocated(Boolean isOverAllocated) {
    this.isOverAllocated = isOverAllocated;
    return this;
  }

   /**
   * Get isOverAllocated
   * @return isOverAllocated
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsOverAllocated() {
    return isOverAllocated;
  }

  public void setIsOverAllocated(Boolean isOverAllocated) {
    this.isOverAllocated = isOverAllocated;
  }

  public Task isEstimated(Boolean isEstimated) {
    this.isEstimated = isEstimated;
    return this;
  }

   /**
   * Determines whether a task is estimated.
   * @return isEstimated
  **/
  @ApiModelProperty(required = true, value = "Determines whether a task is estimated.")
  public Boolean isIsEstimated() {
    return isEstimated;
  }

  public void setIsEstimated(Boolean isEstimated) {
    this.isEstimated = isEstimated;
  }

  public Task overtimeCost(BigDecimal overtimeCost) {
    this.overtimeCost = overtimeCost;
    return this;
  }

   /**
   * The sum of an actual and remaining overtime cost of a task.
   * @return overtimeCost
  **/
  @ApiModelProperty(required = true, value = "The sum of an actual and remaining overtime cost of a task.")
  public BigDecimal getOvertimeCost() {
    return overtimeCost;
  }

  public void setOvertimeCost(BigDecimal overtimeCost) {
    this.overtimeCost = overtimeCost;
  }

  public Task overtimeWork(String overtimeWork) {
    this.overtimeWork = overtimeWork;
    return this;
  }

   /**
   * The amount of an overtime work scheduled for a task.
   * @return overtimeWork
  **/
  @ApiModelProperty(required = true, value = "The amount of an overtime work scheduled for a task.")
  public String getOvertimeWork() {
    return overtimeWork;
  }

  public void setOvertimeWork(String overtimeWork) {
    this.overtimeWork = overtimeWork;
  }

  public Task physicalPercentComplete(Integer physicalPercentComplete) {
    this.physicalPercentComplete = physicalPercentComplete;
    return this;
  }

   /**
   * The percentage complete value entered by the Project Manager.
   * @return physicalPercentComplete
  **/
  @ApiModelProperty(required = true, value = "The percentage complete value entered by the Project Manager.")
  public Integer getPhysicalPercentComplete() {
    return physicalPercentComplete;
  }

  public void setPhysicalPercentComplete(Integer physicalPercentComplete) {
    this.physicalPercentComplete = physicalPercentComplete;
  }

  public Task preLeveledFinish(OffsetDateTime preLeveledFinish) {
    this.preLeveledFinish = preLeveledFinish;
    return this;
  }

   /**
   * Get preLeveledFinish
   * @return preLeveledFinish
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getPreLeveledFinish() {
    return preLeveledFinish;
  }

  public void setPreLeveledFinish(OffsetDateTime preLeveledFinish) {
    this.preLeveledFinish = preLeveledFinish;
  }

  public Task preLeveledStart(OffsetDateTime preLeveledStart) {
    this.preLeveledStart = preLeveledStart;
    return this;
  }

   /**
   * Get preLeveledStart
   * @return preLeveledStart
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getPreLeveledStart() {
    return preLeveledStart;
  }

  public void setPreLeveledStart(OffsetDateTime preLeveledStart) {
    this.preLeveledStart = preLeveledStart;
  }

  public Task isRecurring(Boolean isRecurring) {
    this.isRecurring = isRecurring;
    return this;
  }

   /**
   * Determines whether a task is a recurring task.
   * @return isRecurring
  **/
  @ApiModelProperty(required = true, value = "Determines whether a task is a recurring task.")
  public Boolean isIsRecurring() {
    return isRecurring;
  }

  public void setIsRecurring(Boolean isRecurring) {
    this.isRecurring = isRecurring;
  }

  public Task regularWork(String regularWork) {
    this.regularWork = regularWork;
    return this;
  }

   /**
   * The amount of non-overtime work scheduled for a task.
   * @return regularWork
  **/
  @ApiModelProperty(required = true, value = "The amount of non-overtime work scheduled for a task.")
  public String getRegularWork() {
    return regularWork;
  }

  public void setRegularWork(String regularWork) {
    this.regularWork = regularWork;
  }

  public Task remainingCost(BigDecimal remainingCost) {
    this.remainingCost = remainingCost;
    return this;
  }

   /**
   * The remaining projected cost of completing a task.
   * @return remainingCost
  **/
  @ApiModelProperty(required = true, value = "The remaining projected cost of completing a task.")
  public BigDecimal getRemainingCost() {
    return remainingCost;
  }

  public void setRemainingCost(BigDecimal remainingCost) {
    this.remainingCost = remainingCost;
  }

  public Task remainingDuration(String remainingDuration) {
    this.remainingDuration = remainingDuration;
    return this;
  }

   /**
   * The amount of time required to complete the unfinished portion of a task.
   * @return remainingDuration
  **/
  @ApiModelProperty(required = true, value = "The amount of time required to complete the unfinished portion of a task.")
  public String getRemainingDuration() {
    return remainingDuration;
  }

  public void setRemainingDuration(String remainingDuration) {
    this.remainingDuration = remainingDuration;
  }

  public Task remainingOvertimeCost(BigDecimal remainingOvertimeCost) {
    this.remainingOvertimeCost = remainingOvertimeCost;
    return this;
  }

   /**
   * The remaining overtime cost projected to finish a task.
   * @return remainingOvertimeCost
  **/
  @ApiModelProperty(required = true, value = "The remaining overtime cost projected to finish a task.")
  public BigDecimal getRemainingOvertimeCost() {
    return remainingOvertimeCost;
  }

  public void setRemainingOvertimeCost(BigDecimal remainingOvertimeCost) {
    this.remainingOvertimeCost = remainingOvertimeCost;
  }

  public Task remainingOvertimeWork(String remainingOvertimeWork) {
    this.remainingOvertimeWork = remainingOvertimeWork;
    return this;
  }

   /**
   * The remaining overtime work scheduled to finish a task.
   * @return remainingOvertimeWork
  **/
  @ApiModelProperty(required = true, value = "The remaining overtime work scheduled to finish a task.")
  public String getRemainingOvertimeWork() {
    return remainingOvertimeWork;
  }

  public void setRemainingOvertimeWork(String remainingOvertimeWork) {
    this.remainingOvertimeWork = remainingOvertimeWork;
  }

  public Task remainingWork(String remainingWork) {
    this.remainingWork = remainingWork;
    return this;
  }

   /**
   * The remaining work scheduled to complete a task.
   * @return remainingWork
  **/
  @ApiModelProperty(required = true, value = "The remaining work scheduled to complete a task.")
  public String getRemainingWork() {
    return remainingWork;
  }

  public void setRemainingWork(String remainingWork) {
    this.remainingWork = remainingWork;
  }

  public Task resume(OffsetDateTime resume) {
    this.resume = resume;
    return this;
  }

   /**
   * The date when a task resumed.
   * @return resume
  **/
  @ApiModelProperty(required = true, value = "The date when a task resumed.")
  public OffsetDateTime getResume() {
    return resume;
  }

  public void setResume(OffsetDateTime resume) {
    this.resume = resume;
  }

  public Task isResumeValid(Boolean isResumeValid) {
    this.isResumeValid = isResumeValid;
    return this;
  }

   /**
   * Determines whether a task can be resumed.
   * @return isResumeValid
  **/
  @ApiModelProperty(value = "Determines whether a task can be resumed.")
  public Boolean isIsResumeValid() {
    return isResumeValid;
  }

  public void setIsResumeValid(Boolean isResumeValid) {
    this.isResumeValid = isResumeValid;
  }

  public Task stop(OffsetDateTime stop) {
    this.stop = stop;
    return this;
  }

   /**
   * The date that represents the end of the actual portion of a task.
   * @return stop
  **/
  @ApiModelProperty(required = true, value = "The date that represents the end of the actual portion of a task.")
  public OffsetDateTime getStop() {
    return stop;
  }

  public void setStop(OffsetDateTime stop) {
    this.stop = stop;
  }

  public Task isRollup(Boolean isRollup) {
    this.isRollup = isRollup;
    return this;
  }

   /**
   * Determines whether a task is rolled up.
   * @return isRollup
  **/
  @ApiModelProperty(required = true, value = "Determines whether a task is rolled up.")
  public Boolean isIsRollup() {
    return isRollup;
  }

  public void setIsRollup(Boolean isRollup) {
    this.isRollup = isRollup;
  }

  public Task startSlack(Integer startSlack) {
    this.startSlack = startSlack;
    return this;
  }

   /**
   * Returns the task&#39;s start slack.
   * @return startSlack
  **/
  @ApiModelProperty(required = true, value = "Returns the task's start slack.")
  public Integer getStartSlack() {
    return startSlack;
  }

  public void setStartSlack(Integer startSlack) {
    this.startSlack = startSlack;
  }

  public Task startVariance(Integer startVariance) {
    this.startVariance = startVariance;
    return this;
  }

   /**
   * The variance of the task start date from the baseline start date as minutes. 
   * @return startVariance
  **/
  @ApiModelProperty(required = true, value = "The variance of the task start date from the baseline start date as minutes. ")
  public Integer getStartVariance() {
    return startVariance;
  }

  public void setStartVariance(Integer startVariance) {
    this.startVariance = startVariance;
  }

  public Task calendarUid(Integer calendarUid) {
    this.calendarUid = calendarUid;
    return this;
  }

   /**
   * The unique id of task calendar.
   * @return calendarUid
  **/
  @ApiModelProperty(required = true, value = "The unique id of task calendar.")
  public Integer getCalendarUid() {
    return calendarUid;
  }

  public void setCalendarUid(Integer calendarUid) {
    this.calendarUid = calendarUid;
  }

  public Task isManual(Boolean isManual) {
    this.isManual = isManual;
    return this;
  }

   /**
   * Determines whether a task is manually scheduled.
   * @return isManual
  **/
  @ApiModelProperty(required = true, value = "Determines whether a task is manually scheduled.")
  public Boolean isIsManual() {
    return isManual;
  }

  public void setIsManual(Boolean isManual) {
    this.isManual = isManual;
  }

  public Task manualStart(OffsetDateTime manualStart) {
    this.manualStart = manualStart;
    return this;
  }

   /**
   * Defines manually scheduled start of a task.
   * @return manualStart
  **/
  @ApiModelProperty(required = true, value = "Defines manually scheduled start of a task.")
  public OffsetDateTime getManualStart() {
    return manualStart;
  }

  public void setManualStart(OffsetDateTime manualStart) {
    this.manualStart = manualStart;
  }

  public Task manualFinish(OffsetDateTime manualFinish) {
    this.manualFinish = manualFinish;
    return this;
  }

   /**
   * Defines manually scheduled finish of a task.
   * @return manualFinish
  **/
  @ApiModelProperty(required = true, value = "Defines manually scheduled finish of a task.")
  public OffsetDateTime getManualFinish() {
    return manualFinish;
  }

  public void setManualFinish(OffsetDateTime manualFinish) {
    this.manualFinish = manualFinish;
  }

  public Task manualDuration(String manualDuration) {
    this.manualDuration = manualDuration;
    return this;
  }

   /**
   * Defines manually scheduled duration of a task.
   * @return manualDuration
  **/
  @ApiModelProperty(required = true, value = "Defines manually scheduled duration of a task.")
  public String getManualDuration() {
    return manualDuration;
  }

  public void setManualDuration(String manualDuration) {
    this.manualDuration = manualDuration;
  }

  public Task totalSlack(Integer totalSlack) {
    this.totalSlack = totalSlack;
    return this;
  }

   /**
   * The amount of a total slack.
   * @return totalSlack
  **/
  @ApiModelProperty(required = true, value = "The amount of a total slack.")
  public Integer getTotalSlack() {
    return totalSlack;
  }

  public void setTotalSlack(Integer totalSlack) {
    this.totalSlack = totalSlack;
  }

  public Task type(TaskType type) {
    this.type = type;
    return this;
  }

   /**
   * The type of a task.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of a task.")
  public TaskType getType() {
    return type;
  }

  public void setType(TaskType type) {
    this.type = type;
  }

  public Task wbs(String wbs) {
    this.wbs = wbs;
    return this;
  }

   /**
   * The work breakdown structure code of a task.
   * @return wbs
  **/
  @ApiModelProperty(value = "The work breakdown structure code of a task.")
  public String getWbs() {
    return wbs;
  }

  public void setWbs(String wbs) {
    this.wbs = wbs;
  }

  public Task priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * The priority of a task from 0 to 1000.
   * @return priority
  **/
  @ApiModelProperty(required = true, value = "The priority of a task from 0 to 1000.")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public Task work(String work) {
    this.work = work;
    return this;
  }

   /**
   * The amount of the scheduled work for a task.
   * @return work
  **/
  @ApiModelProperty(required = true, value = "The amount of the scheduled work for a task.")
  public String getWork() {
    return work;
  }

  public void setWork(String work) {
    this.work = work;
  }

  public Task workVariance(Double workVariance) {
    this.workVariance = workVariance;
    return this;
  }

   /**
   * The variance of the task work from the baseline task work as minutes.
   * @return workVariance
  **/
  @ApiModelProperty(required = true, value = "The variance of the task work from the baseline task work as minutes.")
  public Double getWorkVariance() {
    return workVariance;
  }

  public void setWorkVariance(Double workVariance) {
    this.workVariance = workVariance;
  }

  public Task notesText(String notesText) {
    this.notesText = notesText;
    return this;
  }

   /**
   * Notes&#39; plain text extracted from RTF data.
   * @return notesText
  **/
  @ApiModelProperty(value = "Notes' plain text extracted from RTF data.")
  public String getNotesText() {
    return notesText;
  }

  public void setNotesText(String notesText) {
    this.notesText = notesText;
  }

  public Task notesRTF(String notesRTF) {
    this.notesRTF = notesRTF;
    return this;
  }

   /**
   * The text notes in RTF format.
   * @return notesRTF
  **/
  @ApiModelProperty(value = "The text notes in RTF format.")
  public String getNotesRTF() {
    return notesRTF;
  }

  public void setNotesRTF(String notesRTF) {
    this.notesRTF = notesRTF;
  }

  public Task acwp(Double acwp) {
    this.acwp = acwp;
    return this;
  }

   /**
   * Get acwp
   * @return acwp
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getAcwp() {
    return acwp;
  }

  public void setAcwp(Double acwp) {
    this.acwp = acwp;
  }

  public Task bcws(Double bcws) {
    this.bcws = bcws;
    return this;
  }

   /**
   * Get bcws
   * @return bcws
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getBcws() {
    return bcws;
  }

  public void setBcws(Double bcws) {
    this.bcws = bcws;
  }

  public Task bcwp(Double bcwp) {
    this.bcwp = bcwp;
    return this;
  }

   /**
   * Get bcwp
   * @return bcwp
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getBcwp() {
    return bcwp;
  }

  public void setBcwp(Double bcwp) {
    this.bcwp = bcwp;
  }

  public Task levelingDelayFormat(TimeUnitType levelingDelayFormat) {
    this.levelingDelayFormat = levelingDelayFormat;
    return this;
  }

   /**
   * LevelingDelayFormat
   * @return levelingDelayFormat
  **/
  @ApiModelProperty(required = true, value = "LevelingDelayFormat")
  public TimeUnitType getLevelingDelayFormat() {
    return levelingDelayFormat;
  }

  public void setLevelingDelayFormat(TimeUnitType levelingDelayFormat) {
    this.levelingDelayFormat = levelingDelayFormat;
  }

  public Task predecessors(String predecessors) {
    this.predecessors = predecessors;
    return this;
  }

   /**
   * The task Uid numbers for the predecessor tasks on which the task depends before it can be started or finished.
   * @return predecessors
  **/
  @ApiModelProperty(value = "The task Uid numbers for the predecessor tasks on which the task depends before it can be started or finished.")
  public String getPredecessors() {
    return predecessors;
  }

  public void setPredecessors(String predecessors) {
    this.predecessors = predecessors;
  }

  public Task successors(String successors) {
    this.successors = successors;
    return this;
  }

   /**
   * The task Uid numbers for the successor tasks to a task.
   * @return successors
  **/
  @ApiModelProperty(value = "The task Uid numbers for the successor tasks to a task.")
  public String getSuccessors() {
    return successors;
  }

  public void setSuccessors(String successors) {
    this.successors = successors;
  }

  public Task ignoreWarnings(Boolean ignoreWarnings) {
    this.ignoreWarnings = ignoreWarnings;
    return this;
  }

   /**
   * Indicates whether to hide the schedule conflict warning indicator in Microsoft Project.             
   * @return ignoreWarnings
  **/
  @ApiModelProperty(required = true, value = "Indicates whether to hide the schedule conflict warning indicator in Microsoft Project.             ")
  public Boolean isIgnoreWarnings() {
    return ignoreWarnings;
  }

  public void setIgnoreWarnings(Boolean ignoreWarnings) {
    this.ignoreWarnings = ignoreWarnings;
  }

  public Task isExpanded(Boolean isExpanded) {
    this.isExpanded = isExpanded;
    return this;
  }

   /**
   * Determines whether a summary task is expanded or not in GanttChart view.
   * @return isExpanded
  **/
  @ApiModelProperty(required = true, value = "Determines whether a summary task is expanded or not in GanttChart view.")
  public Boolean isIsExpanded() {
    return isExpanded;
  }

  public void setIsExpanded(Boolean isExpanded) {
    this.isExpanded = isExpanded;
  }

  public Task displayOnTimeline(Boolean displayOnTimeline) {
    this.displayOnTimeline = displayOnTimeline;
    return this;
  }

   /**
   * Specifies whether a task should be displayed on a timeline view.
   * @return displayOnTimeline
  **/
  @ApiModelProperty(required = true, value = "Specifies whether a task should be displayed on a timeline view.")
  public Boolean isDisplayOnTimeline() {
    return displayOnTimeline;
  }

  public void setDisplayOnTimeline(Boolean displayOnTimeline) {
    this.displayOnTimeline = displayOnTimeline;
  }

  public Task displayAsSummary(Boolean displayAsSummary) {
    this.displayAsSummary = displayAsSummary;
    return this;
  }

   /**
   * Determines whether the task should be displayed as a summary task. Reading supported for XML format only.
   * @return displayAsSummary
  **/
  @ApiModelProperty(required = true, value = "Determines whether the task should be displayed as a summary task. Reading supported for XML format only.")
  public Boolean isDisplayAsSummary() {
    return displayAsSummary;
  }

  public void setDisplayAsSummary(Boolean displayAsSummary) {
    this.displayAsSummary = displayAsSummary;
  }

  public Task hyperlink(String hyperlink) {
    this.hyperlink = hyperlink;
    return this;
  }

   /**
   * The title or explanatory text for a hyperlink associated with a task.
   * @return hyperlink
  **/
  @ApiModelProperty(value = "The title or explanatory text for a hyperlink associated with a task.")
  public String getHyperlink() {
    return hyperlink;
  }

  public void setHyperlink(String hyperlink) {
    this.hyperlink = hyperlink;
  }

  public Task hyperlinkAddress(String hyperlinkAddress) {
    this.hyperlinkAddress = hyperlinkAddress;
    return this;
  }

   /**
   * The address for a hyperlink associated with a task.
   * @return hyperlinkAddress
  **/
  @ApiModelProperty(value = "The address for a hyperlink associated with a task.")
  public String getHyperlinkAddress() {
    return hyperlinkAddress;
  }

  public void setHyperlinkAddress(String hyperlinkAddress) {
    this.hyperlinkAddress = hyperlinkAddress;
  }

  public Task hyperlinkSubAddress(String hyperlinkSubAddress) {
    this.hyperlinkSubAddress = hyperlinkSubAddress;
    return this;
  }

   /**
   * The specific location in a document in a hyperlink associated with a task.  type.
   * @return hyperlinkSubAddress
  **/
  @ApiModelProperty(value = "The specific location in a document in a hyperlink associated with a task.  type.")
  public String getHyperlinkSubAddress() {
    return hyperlinkSubAddress;
  }

  public void setHyperlinkSubAddress(String hyperlinkSubAddress) {
    this.hyperlinkSubAddress = hyperlinkSubAddress;
  }

  public Task earnedValueMethod(EarnedValueMethodType earnedValueMethod) {
    this.earnedValueMethod = earnedValueMethod;
    return this;
  }

   /**
   * Determines whether the % Complete or Physical % Complete field should be used to calculate budgeted cost of work performed (BCWP).
   * @return earnedValueMethod
  **/
  @ApiModelProperty(required = true, value = "Determines whether the % Complete or Physical % Complete field should be used to calculate budgeted cost of work performed (BCWP).")
  public EarnedValueMethodType getEarnedValueMethod() {
    return earnedValueMethod;
  }

  public void setEarnedValueMethod(EarnedValueMethodType earnedValueMethod) {
    this.earnedValueMethod = earnedValueMethod;
  }

  public Task isPublished(Boolean isPublished) {
    this.isPublished = isPublished;
    return this;
  }

   /**
   * Determines whether the current task should be published to Project Server with the rest of the project.
   * @return isPublished
  **/
  @ApiModelProperty(required = true, value = "Determines whether the current task should be published to Project Server with the rest of the project.")
  public Boolean isIsPublished() {
    return isPublished;
  }

  public void setIsPublished(Boolean isPublished) {
    this.isPublished = isPublished;
  }

  public Task statusManager(String statusManager) {
    this.statusManager = statusManager;
    return this;
  }

   /**
   * The name of the enterprise resource who is to receive status updates for the current task from resources.
   * @return statusManager
  **/
  @ApiModelProperty(value = "The name of the enterprise resource who is to receive status updates for the current task from resources.")
  public String getStatusManager() {
    return statusManager;
  }

  public void setStatusManager(String statusManager) {
    this.statusManager = statusManager;
  }

  public Task commitmentStart(OffsetDateTime commitmentStart) {
    this.commitmentStart = commitmentStart;
    return this;
  }

   /**
   * The start date of a delivery. Reading supported for XML format only.
   * @return commitmentStart
  **/
  @ApiModelProperty(required = true, value = "The start date of a delivery. Reading supported for XML format only.")
  public OffsetDateTime getCommitmentStart() {
    return commitmentStart;
  }

  public void setCommitmentStart(OffsetDateTime commitmentStart) {
    this.commitmentStart = commitmentStart;
  }

  public Task commitmentFinish(OffsetDateTime commitmentFinish) {
    this.commitmentFinish = commitmentFinish;
    return this;
  }

   /**
   * The finish date of a delivery. Reading supported for XML format only.
   * @return commitmentFinish
  **/
  @ApiModelProperty(required = true, value = "The finish date of a delivery. Reading supported for XML format only.")
  public OffsetDateTime getCommitmentFinish() {
    return commitmentFinish;
  }

  public void setCommitmentFinish(OffsetDateTime commitmentFinish) {
    this.commitmentFinish = commitmentFinish;
  }

  public Task commitmentType(Integer commitmentType) {
    this.commitmentType = commitmentType;
    return this;
  }

   /**
   * Determines whether a task has an associated delivery or a dependency on an associated delivery. Reading supported for XML format only.
   * @return commitmentType
  **/
  @ApiModelProperty(required = true, value = "Determines whether a task has an associated delivery or a dependency on an associated delivery. Reading supported for XML format only.")
  public Integer getCommitmentType() {
    return commitmentType;
  }

  public void setCommitmentType(Integer commitmentType) {
    this.commitmentType = commitmentType;
  }

  public Task baselines(List<TaskBaseline> baselines) {
    this.baselines = baselines;
    return this;
  }

  public Task addBaselinesItem(TaskBaseline baselinesItem) {
    if (this.baselines == null) {
      this.baselines = new ArrayList<TaskBaseline>();
    }
    this.baselines.add(baselinesItem);
    return this;
  }

   /**
   * Gets or sets the collection of baseline values of the task.
   * @return baselines
  **/
  @ApiModelProperty(value = "Gets or sets the collection of baseline values of the task.")
  public List<TaskBaseline> getBaselines() {
    return baselines;
  }

  public void setBaselines(List<TaskBaseline> baselines) {
    this.baselines = baselines;
  }

  public Task extendedAttributes(List<ExtendedAttribute> extendedAttributes) {
    this.extendedAttributes = extendedAttributes;
    return this;
  }

  public Task addExtendedAttributesItem(ExtendedAttribute extendedAttributesItem) {
    if (this.extendedAttributes == null) {
      this.extendedAttributes = new ArrayList<ExtendedAttribute>();
    }
    this.extendedAttributes.add(extendedAttributesItem);
    return this;
  }

   /**
   * Task extended attributes.
   * @return extendedAttributes
  **/
  @ApiModelProperty(value = "Task extended attributes.")
  public List<ExtendedAttribute> getExtendedAttributes() {
    return extendedAttributes;
  }

  public void setExtendedAttributes(List<ExtendedAttribute> extendedAttributes) {
    this.extendedAttributes = extendedAttributes;
  }

  public Task outlineCodes(List<OutlineCode> outlineCodes) {
    this.outlineCodes = outlineCodes;
    return this;
  }

  public Task addOutlineCodesItem(OutlineCode outlineCodesItem) {
    if (this.outlineCodes == null) {
      this.outlineCodes = new ArrayList<OutlineCode>();
    }
    this.outlineCodes.add(outlineCodesItem);
    return this;
  }

   /**
   * Task outline codes.
   * @return outlineCodes
  **/
  @ApiModelProperty(value = "Task outline codes.")
  public List<OutlineCode> getOutlineCodes() {
    return outlineCodes;
  }

  public void setOutlineCodes(List<OutlineCode> outlineCodes) {
    this.outlineCodes = outlineCodes;
  }

  public Task warning(Boolean warning) {
    this.warning = warning;
    return this;
  }

   /**
   * Represents the flag which indicates that task has schedule discrepancies.
   * @return warning
  **/
  @ApiModelProperty(required = true, value = "Represents the flag which indicates that task has schedule discrepancies.")
  public Boolean isWarning() {
    return warning;
  }

  public void setWarning(Boolean warning) {
    this.warning = warning;
  }

  public Task activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

   /**
   * Represents activity id field - a task&#39;s unique identifier used by Primavera (only applicable to Primavera projects).
   * @return activityId
  **/
  @ApiModelProperty(value = "Represents activity id field - a task's unique identifier used by Primavera (only applicable to Primavera projects).")
  public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Task task = (Task) o;
    return Objects.equals(this.uid, task.uid) &&
        Objects.equals(this.id, task.id) &&
        Objects.equals(this.name, task.name) &&
        Objects.equals(this.durationText, task.durationText) &&
        Objects.equals(this.duration, task.duration) &&
        Objects.equals(this.start, task.start) &&
        Objects.equals(this.finish, task.finish) &&
        Objects.equals(this.startText, task.startText) &&
        Objects.equals(this.finishText, task.finishText) &&
        Objects.equals(this.percentComplete, task.percentComplete) &&
        Objects.equals(this.percentWorkComplete, task.percentWorkComplete) &&
        Objects.equals(this.isActive, task.isActive) &&
        Objects.equals(this.actualCost, task.actualCost) &&
        Objects.equals(this.actualDuration, task.actualDuration) &&
        Objects.equals(this.actualFinish, task.actualFinish) &&
        Objects.equals(this.actualOvertimeCost, task.actualOvertimeCost) &&
        Objects.equals(this.actualOvertimeWork, task.actualOvertimeWork) &&
        Objects.equals(this.actualWorkProtected, task.actualWorkProtected) &&
        Objects.equals(this.actualOvertimeWorkProtected, task.actualOvertimeWorkProtected) &&
        Objects.equals(this.actualStart, task.actualStart) &&
        Objects.equals(this.budgetWork, task.budgetWork) &&
        Objects.equals(this.budgetCost, task.budgetCost) &&
        Objects.equals(this.constraintDate, task.constraintDate) &&
        Objects.equals(this.constraintType, task.constraintType) &&
        Objects.equals(this.contact, task.contact) &&
        Objects.equals(this.cost, task.cost) &&
        Objects.equals(this.cv, task.cv) &&
        Objects.equals(this.deadline, task.deadline) &&
        Objects.equals(this.durationVariance, task.durationVariance) &&
        Objects.equals(this.earlyFinish, task.earlyFinish) &&
        Objects.equals(this.earlyStart, task.earlyStart) &&
        Objects.equals(this.isEffortDriven, task.isEffortDriven) &&
        Objects.equals(this.isExternalTask, task.isExternalTask) &&
        Objects.equals(this.externalTaskProject, task.externalTaskProject) &&
        Objects.equals(this.externalId, task.externalId) &&
        Objects.equals(this.finishSlack, task.finishSlack) &&
        Objects.equals(this.finishVariance, task.finishVariance) &&
        Objects.equals(this.fixedCost, task.fixedCost) &&
        Objects.equals(this.fixedCostAccrual, task.fixedCostAccrual) &&
        Objects.equals(this.freeSlack, task.freeSlack) &&
        Objects.equals(this.guid, task.guid) &&
        Objects.equals(this.hasOverallocatedResource, task.hasOverallocatedResource) &&
        Objects.equals(this.hideBar, task.hideBar) &&
        Objects.equals(this.ignoreResourceCalendar, task.ignoreResourceCalendar) &&
        Objects.equals(this.lateFinish, task.lateFinish) &&
        Objects.equals(this.lateStart, task.lateStart) &&
        Objects.equals(this.isLevelAssignments, task.isLevelAssignments) &&
        Objects.equals(this.canLevelingSplit, task.canLevelingSplit) &&
        Objects.equals(this.levelingDelay, task.levelingDelay) &&
        Objects.equals(this.isMarked, task.isMarked) &&
        Objects.equals(this.isMilestone, task.isMilestone) &&
        Objects.equals(this.isCritical, task.isCritical) &&
        Objects.equals(this.isSubproject, task.isSubproject) &&
        Objects.equals(this.isSubprojectReadOnly, task.isSubprojectReadOnly) &&
        Objects.equals(this.subprojectName, task.subprojectName) &&
        Objects.equals(this.isSummary, task.isSummary) &&
        Objects.equals(this.subtasksUids, task.subtasksUids) &&
        Objects.equals(this.outlineLevel, task.outlineLevel) &&
        Objects.equals(this.isOverAllocated, task.isOverAllocated) &&
        Objects.equals(this.isEstimated, task.isEstimated) &&
        Objects.equals(this.overtimeCost, task.overtimeCost) &&
        Objects.equals(this.overtimeWork, task.overtimeWork) &&
        Objects.equals(this.physicalPercentComplete, task.physicalPercentComplete) &&
        Objects.equals(this.preLeveledFinish, task.preLeveledFinish) &&
        Objects.equals(this.preLeveledStart, task.preLeveledStart) &&
        Objects.equals(this.isRecurring, task.isRecurring) &&
        Objects.equals(this.regularWork, task.regularWork) &&
        Objects.equals(this.remainingCost, task.remainingCost) &&
        Objects.equals(this.remainingDuration, task.remainingDuration) &&
        Objects.equals(this.remainingOvertimeCost, task.remainingOvertimeCost) &&
        Objects.equals(this.remainingOvertimeWork, task.remainingOvertimeWork) &&
        Objects.equals(this.remainingWork, task.remainingWork) &&
        Objects.equals(this.resume, task.resume) &&
        Objects.equals(this.isResumeValid, task.isResumeValid) &&
        Objects.equals(this.stop, task.stop) &&
        Objects.equals(this.isRollup, task.isRollup) &&
        Objects.equals(this.startSlack, task.startSlack) &&
        Objects.equals(this.startVariance, task.startVariance) &&
        Objects.equals(this.calendarUid, task.calendarUid) &&
        Objects.equals(this.isManual, task.isManual) &&
        Objects.equals(this.manualStart, task.manualStart) &&
        Objects.equals(this.manualFinish, task.manualFinish) &&
        Objects.equals(this.manualDuration, task.manualDuration) &&
        Objects.equals(this.totalSlack, task.totalSlack) &&
        Objects.equals(this.type, task.type) &&
        Objects.equals(this.wbs, task.wbs) &&
        Objects.equals(this.priority, task.priority) &&
        Objects.equals(this.work, task.work) &&
        Objects.equals(this.workVariance, task.workVariance) &&
        Objects.equals(this.notesText, task.notesText) &&
        Objects.equals(this.notesRTF, task.notesRTF) &&
        Objects.equals(this.acwp, task.acwp) &&
        Objects.equals(this.bcws, task.bcws) &&
        Objects.equals(this.bcwp, task.bcwp) &&
        Objects.equals(this.levelingDelayFormat, task.levelingDelayFormat) &&
        Objects.equals(this.predecessors, task.predecessors) &&
        Objects.equals(this.successors, task.successors) &&
        Objects.equals(this.ignoreWarnings, task.ignoreWarnings) &&
        Objects.equals(this.isExpanded, task.isExpanded) &&
        Objects.equals(this.displayOnTimeline, task.displayOnTimeline) &&
        Objects.equals(this.displayAsSummary, task.displayAsSummary) &&
        Objects.equals(this.hyperlink, task.hyperlink) &&
        Objects.equals(this.hyperlinkAddress, task.hyperlinkAddress) &&
        Objects.equals(this.hyperlinkSubAddress, task.hyperlinkSubAddress) &&
        Objects.equals(this.earnedValueMethod, task.earnedValueMethod) &&
        Objects.equals(this.isPublished, task.isPublished) &&
        Objects.equals(this.statusManager, task.statusManager) &&
        Objects.equals(this.commitmentStart, task.commitmentStart) &&
        Objects.equals(this.commitmentFinish, task.commitmentFinish) &&
        Objects.equals(this.commitmentType, task.commitmentType) &&
        Objects.equals(this.baselines, task.baselines) &&
        Objects.equals(this.extendedAttributes, task.extendedAttributes) &&
        Objects.equals(this.outlineCodes, task.outlineCodes) &&
        Objects.equals(this.warning, task.warning) &&
        Objects.equals(this.activityId, task.activityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, id, name, durationText, duration, start, finish, startText, finishText, percentComplete, percentWorkComplete, isActive, actualCost, actualDuration, actualFinish, actualOvertimeCost, actualOvertimeWork, actualWorkProtected, actualOvertimeWorkProtected, actualStart, budgetWork, budgetCost, constraintDate, constraintType, contact, cost, cv, deadline, durationVariance, earlyFinish, earlyStart, isEffortDriven, isExternalTask, externalTaskProject, externalId, finishSlack, finishVariance, fixedCost, fixedCostAccrual, freeSlack, guid, hasOverallocatedResource, hideBar, ignoreResourceCalendar, lateFinish, lateStart, isLevelAssignments, canLevelingSplit, levelingDelay, isMarked, isMilestone, isCritical, isSubproject, isSubprojectReadOnly, subprojectName, isSummary, subtasksUids, outlineLevel, isOverAllocated, isEstimated, overtimeCost, overtimeWork, physicalPercentComplete, preLeveledFinish, preLeveledStart, isRecurring, regularWork, remainingCost, remainingDuration, remainingOvertimeCost, remainingOvertimeWork, remainingWork, resume, isResumeValid, stop, isRollup, startSlack, startVariance, calendarUid, isManual, manualStart, manualFinish, manualDuration, totalSlack, type, wbs, priority, work, workVariance, notesText, notesRTF, acwp, bcws, bcwp, levelingDelayFormat, predecessors, successors, ignoreWarnings, isExpanded, displayOnTimeline, displayAsSummary, hyperlink, hyperlinkAddress, hyperlinkSubAddress, earnedValueMethod, isPublished, statusManager, commitmentStart, commitmentFinish, commitmentType, baselines, extendedAttributes, outlineCodes, warning, activityId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Task {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    durationText: ").append(toIndentedString(durationText)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    finish: ").append(toIndentedString(finish)).append("\n");
    sb.append("    startText: ").append(toIndentedString(startText)).append("\n");
    sb.append("    finishText: ").append(toIndentedString(finishText)).append("\n");
    sb.append("    percentComplete: ").append(toIndentedString(percentComplete)).append("\n");
    sb.append("    percentWorkComplete: ").append(toIndentedString(percentWorkComplete)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    actualCost: ").append(toIndentedString(actualCost)).append("\n");
    sb.append("    actualDuration: ").append(toIndentedString(actualDuration)).append("\n");
    sb.append("    actualFinish: ").append(toIndentedString(actualFinish)).append("\n");
    sb.append("    actualOvertimeCost: ").append(toIndentedString(actualOvertimeCost)).append("\n");
    sb.append("    actualOvertimeWork: ").append(toIndentedString(actualOvertimeWork)).append("\n");
    sb.append("    actualWorkProtected: ").append(toIndentedString(actualWorkProtected)).append("\n");
    sb.append("    actualOvertimeWorkProtected: ").append(toIndentedString(actualOvertimeWorkProtected)).append("\n");
    sb.append("    actualStart: ").append(toIndentedString(actualStart)).append("\n");
    sb.append("    budgetWork: ").append(toIndentedString(budgetWork)).append("\n");
    sb.append("    budgetCost: ").append(toIndentedString(budgetCost)).append("\n");
    sb.append("    constraintDate: ").append(toIndentedString(constraintDate)).append("\n");
    sb.append("    constraintType: ").append(toIndentedString(constraintType)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    cv: ").append(toIndentedString(cv)).append("\n");
    sb.append("    deadline: ").append(toIndentedString(deadline)).append("\n");
    sb.append("    durationVariance: ").append(toIndentedString(durationVariance)).append("\n");
    sb.append("    earlyFinish: ").append(toIndentedString(earlyFinish)).append("\n");
    sb.append("    earlyStart: ").append(toIndentedString(earlyStart)).append("\n");
    sb.append("    isEffortDriven: ").append(toIndentedString(isEffortDriven)).append("\n");
    sb.append("    isExternalTask: ").append(toIndentedString(isExternalTask)).append("\n");
    sb.append("    externalTaskProject: ").append(toIndentedString(externalTaskProject)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    finishSlack: ").append(toIndentedString(finishSlack)).append("\n");
    sb.append("    finishVariance: ").append(toIndentedString(finishVariance)).append("\n");
    sb.append("    fixedCost: ").append(toIndentedString(fixedCost)).append("\n");
    sb.append("    fixedCostAccrual: ").append(toIndentedString(fixedCostAccrual)).append("\n");
    sb.append("    freeSlack: ").append(toIndentedString(freeSlack)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    hasOverallocatedResource: ").append(toIndentedString(hasOverallocatedResource)).append("\n");
    sb.append("    hideBar: ").append(toIndentedString(hideBar)).append("\n");
    sb.append("    ignoreResourceCalendar: ").append(toIndentedString(ignoreResourceCalendar)).append("\n");
    sb.append("    lateFinish: ").append(toIndentedString(lateFinish)).append("\n");
    sb.append("    lateStart: ").append(toIndentedString(lateStart)).append("\n");
    sb.append("    isLevelAssignments: ").append(toIndentedString(isLevelAssignments)).append("\n");
    sb.append("    canLevelingSplit: ").append(toIndentedString(canLevelingSplit)).append("\n");
    sb.append("    levelingDelay: ").append(toIndentedString(levelingDelay)).append("\n");
    sb.append("    isMarked: ").append(toIndentedString(isMarked)).append("\n");
    sb.append("    isMilestone: ").append(toIndentedString(isMilestone)).append("\n");
    sb.append("    isCritical: ").append(toIndentedString(isCritical)).append("\n");
    sb.append("    isSubproject: ").append(toIndentedString(isSubproject)).append("\n");
    sb.append("    isSubprojectReadOnly: ").append(toIndentedString(isSubprojectReadOnly)).append("\n");
    sb.append("    subprojectName: ").append(toIndentedString(subprojectName)).append("\n");
    sb.append("    isSummary: ").append(toIndentedString(isSummary)).append("\n");
    sb.append("    subtasksUids: ").append(toIndentedString(subtasksUids)).append("\n");
    sb.append("    outlineLevel: ").append(toIndentedString(outlineLevel)).append("\n");
    sb.append("    isOverAllocated: ").append(toIndentedString(isOverAllocated)).append("\n");
    sb.append("    isEstimated: ").append(toIndentedString(isEstimated)).append("\n");
    sb.append("    overtimeCost: ").append(toIndentedString(overtimeCost)).append("\n");
    sb.append("    overtimeWork: ").append(toIndentedString(overtimeWork)).append("\n");
    sb.append("    physicalPercentComplete: ").append(toIndentedString(physicalPercentComplete)).append("\n");
    sb.append("    preLeveledFinish: ").append(toIndentedString(preLeveledFinish)).append("\n");
    sb.append("    preLeveledStart: ").append(toIndentedString(preLeveledStart)).append("\n");
    sb.append("    isRecurring: ").append(toIndentedString(isRecurring)).append("\n");
    sb.append("    regularWork: ").append(toIndentedString(regularWork)).append("\n");
    sb.append("    remainingCost: ").append(toIndentedString(remainingCost)).append("\n");
    sb.append("    remainingDuration: ").append(toIndentedString(remainingDuration)).append("\n");
    sb.append("    remainingOvertimeCost: ").append(toIndentedString(remainingOvertimeCost)).append("\n");
    sb.append("    remainingOvertimeWork: ").append(toIndentedString(remainingOvertimeWork)).append("\n");
    sb.append("    remainingWork: ").append(toIndentedString(remainingWork)).append("\n");
    sb.append("    resume: ").append(toIndentedString(resume)).append("\n");
    sb.append("    isResumeValid: ").append(toIndentedString(isResumeValid)).append("\n");
    sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
    sb.append("    isRollup: ").append(toIndentedString(isRollup)).append("\n");
    sb.append("    startSlack: ").append(toIndentedString(startSlack)).append("\n");
    sb.append("    startVariance: ").append(toIndentedString(startVariance)).append("\n");
    sb.append("    calendarUid: ").append(toIndentedString(calendarUid)).append("\n");
    sb.append("    isManual: ").append(toIndentedString(isManual)).append("\n");
    sb.append("    manualStart: ").append(toIndentedString(manualStart)).append("\n");
    sb.append("    manualFinish: ").append(toIndentedString(manualFinish)).append("\n");
    sb.append("    manualDuration: ").append(toIndentedString(manualDuration)).append("\n");
    sb.append("    totalSlack: ").append(toIndentedString(totalSlack)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    wbs: ").append(toIndentedString(wbs)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    work: ").append(toIndentedString(work)).append("\n");
    sb.append("    workVariance: ").append(toIndentedString(workVariance)).append("\n");
    sb.append("    notesText: ").append(toIndentedString(notesText)).append("\n");
    sb.append("    notesRTF: ").append(toIndentedString(notesRTF)).append("\n");
    sb.append("    acwp: ").append(toIndentedString(acwp)).append("\n");
    sb.append("    bcws: ").append(toIndentedString(bcws)).append("\n");
    sb.append("    bcwp: ").append(toIndentedString(bcwp)).append("\n");
    sb.append("    levelingDelayFormat: ").append(toIndentedString(levelingDelayFormat)).append("\n");
    sb.append("    predecessors: ").append(toIndentedString(predecessors)).append("\n");
    sb.append("    successors: ").append(toIndentedString(successors)).append("\n");
    sb.append("    ignoreWarnings: ").append(toIndentedString(ignoreWarnings)).append("\n");
    sb.append("    isExpanded: ").append(toIndentedString(isExpanded)).append("\n");
    sb.append("    displayOnTimeline: ").append(toIndentedString(displayOnTimeline)).append("\n");
    sb.append("    displayAsSummary: ").append(toIndentedString(displayAsSummary)).append("\n");
    sb.append("    hyperlink: ").append(toIndentedString(hyperlink)).append("\n");
    sb.append("    hyperlinkAddress: ").append(toIndentedString(hyperlinkAddress)).append("\n");
    sb.append("    hyperlinkSubAddress: ").append(toIndentedString(hyperlinkSubAddress)).append("\n");
    sb.append("    earnedValueMethod: ").append(toIndentedString(earnedValueMethod)).append("\n");
    sb.append("    isPublished: ").append(toIndentedString(isPublished)).append("\n");
    sb.append("    statusManager: ").append(toIndentedString(statusManager)).append("\n");
    sb.append("    commitmentStart: ").append(toIndentedString(commitmentStart)).append("\n");
    sb.append("    commitmentFinish: ").append(toIndentedString(commitmentFinish)).append("\n");
    sb.append("    commitmentType: ").append(toIndentedString(commitmentType)).append("\n");
    sb.append("    baselines: ").append(toIndentedString(baselines)).append("\n");
    sb.append("    extendedAttributes: ").append(toIndentedString(extendedAttributes)).append("\n");
    sb.append("    outlineCodes: ").append(toIndentedString(outlineCodes)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
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


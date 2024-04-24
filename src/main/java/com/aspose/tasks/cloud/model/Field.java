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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Specifies a field in the Microsoft Office Project.
 */
@JsonAdapter(Field.Adapter.class)
public enum Field {
  
  UNDEFINED("Undefined"),
  
  TASKWORK("TaskWork"),
  
  TASKBASELINEWORK("TaskBaselineWork"),
  
  TASKACTUALWORK("TaskActualWork"),
  
  TASKWORKVARIANCE("TaskWorkVariance"),
  
  TASKREMAININGWORK("TaskRemainingWork"),
  
  TASKCOST("TaskCost"),
  
  TASKBASELINECOST("TaskBaselineCost"),
  
  TASKACTUALCOST("TaskActualCost"),
  
  TASKFIXEDCOST("TaskFixedCost"),
  
  TASKCOSTVARIANCE("TaskCostVariance"),
  
  TASKREMAININGCOST("TaskRemainingCost"),
  
  TASKBCWP("TaskBCWP"),
  
  TASKBCWS("TaskBCWS"),
  
  TASKSV("TaskSV"),
  
  TASKNAME("TaskName"),
  
  TASKNOTES("TaskNotes"),
  
  TASKWBS("TaskWBS"),
  
  TASKCONSTRAINTTYPE("TaskConstraintType"),
  
  TASKCONSTRAINTDATE("TaskConstraintDate"),
  
  TASKCRITICAL("TaskCritical"),
  
  TASKLEVELDELAY("TaskLevelDelay"),
  
  TASKFREESLACK("TaskFreeSlack"),
  
  TASKTOTALSLACK("TaskTotalSlack"),
  
  TASKID("TaskID"),
  
  TASKMILESTONE("TaskMilestone"),
  
  TASKPRIORITY("TaskPriority"),
  
  TASKSUBPROJECT("TaskSubproject"),
  
  TASKBASELINEDURATION("TaskBaselineDuration"),
  
  TASKACTUALDURATION("TaskActualDuration"),
  
  TASKDURATION("TaskDuration"),
  
  TASKDURATIONVARIANCE("TaskDurationVariance"),
  
  TASKREMAININGDURATION("TaskRemainingDuration"),
  
  TASKPERCENTCOMPLETE("TaskPercentComplete"),
  
  TASKPERCENTWORKCOMPLETE("TaskPercentWorkComplete"),
  
  TASKFIXEDDURATION("TaskFixedDuration"),
  
  TASKSTART("TaskStart"),
  
  TASKFINISH("TaskFinish"),
  
  TASKEARLYSTART("TaskEarlyStart"),
  
  TASKEARLYFINISH("TaskEarlyFinish"),
  
  TASKLATESTART("TaskLateStart"),
  
  TASKLATEFINISH("TaskLateFinish"),
  
  TASKACTUALSTART("TaskActualStart"),
  
  TASKACTUALFINISH("TaskActualFinish"),
  
  TASKBASELINESTART("TaskBaselineStart"),
  
  TASKBASELINEFINISH("TaskBaselineFinish"),
  
  TASKSTARTVARIANCE("TaskStartVariance"),
  
  TASKFINISHVARIANCE("TaskFinishVariance"),
  
  TASKPREDECESSORS("TaskPredecessors"),
  
  TASKSUCCESSORS("TaskSuccessors"),
  
  TASKRESOURCENAMES("TaskResourceNames"),
  
  TASKRESOURCEINITIALS("TaskResourceInitials"),
  
  TASKTEXT1("TaskText1"),
  
  TASKSTART1("TaskStart1"),
  
  TASKFINISH1("TaskFinish1"),
  
  TASKTEXT2("TaskText2"),
  
  TASKSTART2("TaskStart2"),
  
  TASKFINISH2("TaskFinish2"),
  
  TASKTEXT3("TaskText3"),
  
  TASKSTART3("TaskStart3"),
  
  TASKFINISH3("TaskFinish3"),
  
  TASKTEXT4("TaskText4"),
  
  TASKSTART4("TaskStart4"),
  
  TASKFINISH4("TaskFinish4"),
  
  TASKTEXT5("TaskText5"),
  
  TASKSTART5("TaskStart5"),
  
  TASKFINISH5("TaskFinish5"),
  
  TASKTEXT6("TaskText6"),
  
  TASKTEXT7("TaskText7"),
  
  TASKTEXT8("TaskText8"),
  
  TASKTEXT9("TaskText9"),
  
  TASKTEXT10("TaskText10"),
  
  TASKMARKED("TaskMarked"),
  
  TASKFLAG1("TaskFlag1"),
  
  TASKFLAG2("TaskFlag2"),
  
  TASKFLAG3("TaskFlag3"),
  
  TASKFLAG4("TaskFlag4"),
  
  TASKFLAG5("TaskFlag5"),
  
  TASKFLAG6("TaskFlag6"),
  
  TASKFLAG7("TaskFlag7"),
  
  TASKFLAG8("TaskFlag8"),
  
  TASKFLAG9("TaskFlag9"),
  
  TASKFLAG10("TaskFlag10"),
  
  TASKROLLUP("TaskRollup"),
  
  TASKCV("TaskCV"),
  
  TASKPROJECT("TaskProject"),
  
  TASKOUTLINELEVEL("TaskOutlineLevel"),
  
  TASKUNIQUEID("TaskUniqueID"),
  
  TASKNUMBER1("TaskNumber1"),
  
  TASKNUMBER2("TaskNumber2"),
  
  TASKNUMBER3("TaskNumber3"),
  
  TASKNUMBER4("TaskNumber4"),
  
  TASKNUMBER5("TaskNumber5"),
  
  TASKSUMMARY("TaskSummary"),
  
  TASKCREATED("TaskCreated"),
  
  TASKSHEETNOTES("TaskSheetNotes"),
  
  TASKUNIQUEPREDECESSORS("TaskUniquePredecessors"),
  
  TASKUNIQUESUCCESSORS("TaskUniqueSuccessors"),
  
  TASKOBJECTS("TaskObjects"),
  
  TASKLINKEDFIELDS("TaskLinkedFields"),
  
  TASKRESUME("TaskResume"),
  
  TASKSTOP("TaskStop"),
  
  TASKRESUMENOEARLIERTHAN("TaskResumeNoEarlierThan"),
  
  TASKOUTLINENUMBER("TaskOutlineNumber"),
  
  TASKDURATION1("TaskDuration1"),
  
  TASKDURATION2("TaskDuration2"),
  
  TASKDURATION3("TaskDuration3"),
  
  TASKCOST1("TaskCost1"),
  
  TASKCOST2("TaskCost2"),
  
  TASKCOST3("TaskCost3"),
  
  TASKHIDEBAR("TaskHideBar"),
  
  TASKCONFIRMED("TaskConfirmed"),
  
  TASKUPDATENEEDED("TaskUpdateNeeded"),
  
  TASKCONTACT("TaskContact"),
  
  TASKRESOURCEGROUP("TaskResourceGroup"),
  
  TASKCOMPLETETHROUGH("TaskCompleteThrough"),
  
  TASKACWP("TaskACWP"),
  
  TASKTYPE("TaskType"),
  
  TASKRECURRING("TaskRecurring"),
  
  TASKEFFORTDRIVEN("TaskEffortDriven"),
  
  TASKPARENTTASK("TaskParentTask"),
  
  TASKOVERTIMEWORK("TaskOvertimeWork"),
  
  TASKACTUALOVERTIMEWORK("TaskActualOvertimeWork"),
  
  TASKREMAININGOVERTIMEWORK("TaskRemainingOvertimeWork"),
  
  TASKREGULARWORK("TaskRegularWork"),
  
  TASKOVERTIMECOST("TaskOvertimeCost"),
  
  TASKACTUALOVERTIMECOST("TaskActualOvertimeCost"),
  
  TASKREMAININGOVERTIMECOST("TaskRemainingOvertimeCost"),
  
  TASKFIXEDCOSTACCRUAL("TaskFixedCostAccrual"),
  
  TASKINDICATORS("TaskIndicators"),
  
  TASKHYPERLINKID("TaskHyperlinkId"),
  
  TASKHYPERLINK("TaskHyperlink"),
  
  TASKHYPERLINKADDRESS("TaskHyperlinkAddress"),
  
  TASKHYPERLINKSUBADDRESS("TaskHyperlinkSubAddress"),
  
  TASKHYPERLINKHREF("TaskHyperlinkHref"),
  
  TASKISASSIGNMENT("TaskIsAssignment"),
  
  TASKOVERALLOCATED("TaskOverallocated"),
  
  TASKEXTERNALTASK("TaskExternalTask"),
  
  TASKSUBPROJECTREADONLY("TaskSubprojectReadOnly"),
  
  TASKRESPONSEPENDING("TaskResponsePending"),
  
  TASKTEAMSTATUSPENDING("TaskTeamStatusPending"),
  
  TASKLEVELCANSPLIT("TaskLevelCanSplit"),
  
  TASKLEVELASSIGNMENTS("TaskLevelAssignments"),
  
  TASKWORKCONTOUR("TaskWorkContour"),
  
  TASKCOST4("TaskCost4"),
  
  TASKCOST5("TaskCost5"),
  
  TASKCOST6("TaskCost6"),
  
  TASKCOST7("TaskCost7"),
  
  TASKCOST8("TaskCost8"),
  
  TASKCOST9("TaskCost9"),
  
  TASKCOST10("TaskCost10"),
  
  TASKDATE1("TaskDate1"),
  
  TASKDATE2("TaskDate2"),
  
  TASKDATE3("TaskDate3"),
  
  TASKDATE4("TaskDate4"),
  
  TASKDATE5("TaskDate5"),
  
  TASKDATE6("TaskDate6"),
  
  TASKDATE7("TaskDate7"),
  
  TASKDATE8("TaskDate8"),
  
  TASKDATE9("TaskDate9"),
  
  TASKDATE10("TaskDate10"),
  
  TASKDURATION4("TaskDuration4"),
  
  TASKDURATION5("TaskDuration5"),
  
  TASKDURATION6("TaskDuration6"),
  
  TASKDURATION7("TaskDuration7"),
  
  TASKDURATION8("TaskDuration8"),
  
  TASKDURATION9("TaskDuration9"),
  
  TASKDURATION10("TaskDuration10"),
  
  TASKSTART6("TaskStart6"),
  
  TASKFINISH6("TaskFinish6"),
  
  TASKSTART7("TaskStart7"),
  
  TASKFINISH7("TaskFinish7"),
  
  TASKSTART8("TaskStart8"),
  
  TASKFINISH8("TaskFinish8"),
  
  TASKSTART9("TaskStart9"),
  
  TASKFINISH9("TaskFinish9"),
  
  TASKSTART10("TaskStart10"),
  
  TASKFINISH10("TaskFinish10"),
  
  TASKFLAG11("TaskFlag11"),
  
  TASKFLAG12("TaskFlag12"),
  
  TASKFLAG13("TaskFlag13"),
  
  TASKFLAG14("TaskFlag14"),
  
  TASKFLAG15("TaskFlag15"),
  
  TASKFLAG16("TaskFlag16"),
  
  TASKFLAG17("TaskFlag17"),
  
  TASKFLAG18("TaskFlag18"),
  
  TASKFLAG19("TaskFlag19"),
  
  TASKFLAG20("TaskFlag20"),
  
  TASKNUMBER6("TaskNumber6"),
  
  TASKNUMBER7("TaskNumber7"),
  
  TASKNUMBER8("TaskNumber8"),
  
  TASKNUMBER9("TaskNumber9"),
  
  TASKNUMBER10("TaskNumber10"),
  
  TASKNUMBER11("TaskNumber11"),
  
  TASKNUMBER12("TaskNumber12"),
  
  TASKNUMBER13("TaskNumber13"),
  
  TASKNUMBER14("TaskNumber14"),
  
  TASKNUMBER15("TaskNumber15"),
  
  TASKNUMBER16("TaskNumber16"),
  
  TASKNUMBER17("TaskNumber17"),
  
  TASKNUMBER18("TaskNumber18"),
  
  TASKNUMBER19("TaskNumber19"),
  
  TASKNUMBER20("TaskNumber20"),
  
  TASKTEXT11("TaskText11"),
  
  TASKTEXT12("TaskText12"),
  
  TASKTEXT13("TaskText13"),
  
  TASKTEXT14("TaskText14"),
  
  TASKTEXT15("TaskText15"),
  
  TASKTEXT16("TaskText16"),
  
  TASKTEXT17("TaskText17"),
  
  TASKTEXT18("TaskText18"),
  
  TASKTEXT19("TaskText19"),
  
  TASKTEXT20("TaskText20"),
  
  TASKTEXT21("TaskText21"),
  
  TASKTEXT22("TaskText22"),
  
  TASKTEXT23("TaskText23"),
  
  TASKTEXT24("TaskText24"),
  
  TASKTEXT25("TaskText25"),
  
  TASKTEXT26("TaskText26"),
  
  TASKTEXT27("TaskText27"),
  
  TASKTEXT28("TaskText28"),
  
  TASKTEXT29("TaskText29"),
  
  TASKTEXT30("TaskText30"),
  
  TASKRESOURCEPHONETICS("TaskResourcePhonetics"),
  
  TASKINDEX("TaskIndex"),
  
  TASKASSIGNMENTDELAY("TaskAssignmentDelay"),
  
  TASKASSIGNMENTUNITS("TaskAssignmentUnits"),
  
  TASKCOSTRATETABLE("TaskCostRateTable"),
  
  TASKPRELEVELEDSTART("TaskPreleveledStart"),
  
  TASKPRELEVELEDFINISH("TaskPreleveledFinish"),
  
  TASKESTIMATED("TaskEstimated"),
  
  TASKIGNORERESOURCECALENDAR("TaskIgnoreResourceCalendar"),
  
  TASKCALENDAR("TaskCalendar"),
  
  TASKDURATION1ESTIMATED("TaskDuration1Estimated"),
  
  TASKDURATION2ESTIMATED("TaskDuration2Estimated"),
  
  TASKDURATION3ESTIMATED("TaskDuration3Estimated"),
  
  TASKDURATION4ESTIMATED("TaskDuration4Estimated"),
  
  TASKDURATION5ESTIMATED("TaskDuration5Estimated"),
  
  TASKDURATION6ESTIMATED("TaskDuration6Estimated"),
  
  TASKDURATION7ESTIMATED("TaskDuration7Estimated"),
  
  TASKDURATION8ESTIMATED("TaskDuration8Estimated"),
  
  TASKDURATION9ESTIMATED("TaskDuration9Estimated"),
  
  TASKDURATION10ESTIMATED("TaskDuration10Estimated"),
  
  TASKBASELINEDURATIONESTIMATED("TaskBaselineDurationEstimated"),
  
  TASKOUTLINECODE1("TaskOutlineCode1"),
  
  TASKOUTLINECODE2("TaskOutlineCode2"),
  
  TASKOUTLINECODE3("TaskOutlineCode3"),
  
  TASKOUTLINECODE4("TaskOutlineCode4"),
  
  TASKOUTLINECODE5("TaskOutlineCode5"),
  
  TASKOUTLINECODE6("TaskOutlineCode6"),
  
  TASKOUTLINECODE7("TaskOutlineCode7"),
  
  TASKOUTLINECODE8("TaskOutlineCode8"),
  
  TASKOUTLINECODE9("TaskOutlineCode9"),
  
  TASKOUTLINECODE10("TaskOutlineCode10"),
  
  TASKDEADLINE("TaskDeadline"),
  
  TASKSTARTSLACK("TaskStartSlack"),
  
  TASKFINISHSLACK("TaskFinishSlack"),
  
  TASKVAC("TaskVAC"),
  
  TASKGROUPBYSUMMARY("TaskGroupBySummary"),
  
  TASKWBSPREDECESSORS("TaskWBSPredecessors"),
  
  TASKWBSSUCCESSORS("TaskWBSSuccessors"),
  
  TASKRESOURCETYPE("TaskResourceType"),
  
  TASKHYPERLINKSCREENTIP("TaskHyperlinkScreenTip"),
  
  TASKBASELINEFIXEDCOST("TaskBaseLineFixedCost"),
  
  TASKBASELINE1START("TaskBaseline1Start"),
  
  TASKBASELINE1FINISH("TaskBaseline1Finish"),
  
  TASKBASELINE1COST("TaskBaseline1Cost"),
  
  TASKBASELINE1WORK("TaskBaseline1Work"),
  
  TASKBASELINE1DURATION("TaskBaseline1Duration"),
  
  TASKBASELINE2START("TaskBaseline2Start"),
  
  TASKBASELINE2FINISH("TaskBaseline2Finish"),
  
  TASKBASELINE2COST("TaskBaseline2Cost"),
  
  TASKBASELINE2WORK("TaskBaseline2Work"),
  
  TASKBASELINE2DURATION("TaskBaseline2Duration"),
  
  TASKBASELINE3START("TaskBaseline3Start"),
  
  TASKBASELINE3FINISH("TaskBaseline3Finish"),
  
  TASKBASELINE3COST("TaskBaseline3Cost"),
  
  TASKBASELINE3WORK("TaskBaseline3Work"),
  
  TASKBASELINE3DURATION("TaskBaseline3Duration"),
  
  TASKBASELINE4START("TaskBaseline4Start"),
  
  TASKBASELINE4FINISH("TaskBaseline4Finish"),
  
  TASKBASELINE4COST("TaskBaseline4Cost"),
  
  TASKBASELINE4WORK("TaskBaseline4Work"),
  
  TASKBASELINE4DURATION("TaskBaseline4Duration"),
  
  TASKBASELINE5START("TaskBaseline5Start"),
  
  TASKBASELINE5FINISH("TaskBaseline5Finish"),
  
  TASKBASELINE5COST("TaskBaseline5Cost"),
  
  TASKBASELINE5WORK("TaskBaseline5Work"),
  
  TASKBASELINE5DURATION("TaskBaseline5Duration"),
  
  TASKCPI("TaskCPI"),
  
  TASKSPI("TaskSPI"),
  
  TASKCVPERCENT("TaskCVPercent"),
  
  TASKSVPERCENT("TaskSVPercent"),
  
  TASKEAC("TaskEAC"),
  
  TASKTCPI("TaskTCPI"),
  
  TASKSTATUS("TaskStatus"),
  
  TASKBASELINE6START("TaskBaseline6Start"),
  
  TASKBASELINE6FINISH("TaskBaseline6Finish"),
  
  TASKBASELINE6COST("TaskBaseline6Cost"),
  
  TASKBASELINE6WORK("TaskBaseline6Work"),
  
  TASKBASELINE6DURATION("TaskBaseline6Duration"),
  
  TASKBASELINE7START("TaskBaseline7Start"),
  
  TASKBASELINE7FINISH("TaskBaseline7Finish"),
  
  TASKBASELINE7COST("TaskBaseline7Cost"),
  
  TASKBASELINE7WORK("TaskBaseline7Work"),
  
  TASKBASELINE7DURATION("TaskBaseline7Duration"),
  
  TASKBASELINE8START("TaskBaseline8Start"),
  
  TASKBASELINE8FINISH("TaskBaseline8Finish"),
  
  TASKBASELINE8COST("TaskBaseline8Cost"),
  
  TASKBASELINE8WORK("TaskBaseline8Work"),
  
  TASKBASELINE8DURATION("TaskBaseline8Duration"),
  
  TASKBASELINE9START("TaskBaseline9Start"),
  
  TASKBASELINE9FINISH("TaskBaseline9Finish"),
  
  TASKBASELINE9COST("TaskBaseline9Cost"),
  
  TASKBASELINE9WORK("TaskBaseline9Work"),
  
  TASKBASELINE9DURATION("TaskBaseline9Duration"),
  
  TASKBASELINE10START("TaskBaseline10Start"),
  
  TASKBASELINE10FINISH("TaskBaseline10Finish"),
  
  TASKBASELINE10COST("TaskBaseline10Cost"),
  
  TASKBASELINE10WORK("TaskBaseline10Work"),
  
  TASKBASELINE10DURATION("TaskBaseline10Duration"),
  
  TASKENTERPRISECOST1("TaskEnterpriseCost1"),
  
  TASKENTERPRISECOST2("TaskEnterpriseCost2"),
  
  TASKENTERPRISECOST3("TaskEnterpriseCost3"),
  
  TASKENTERPRISECOST4("TaskEnterpriseCost4"),
  
  TASKENTERPRISECOST5("TaskEnterpriseCost5"),
  
  TASKENTERPRISECOST6("TaskEnterpriseCost6"),
  
  TASKENTERPRISECOST7("TaskEnterpriseCost7"),
  
  TASKENTERPRISECOST8("TaskEnterpriseCost8"),
  
  TASKENTERPRISECOST9("TaskEnterpriseCost9"),
  
  TASKENTERPRISECOST10("TaskEnterpriseCost10"),
  
  TASKENTERPRISEDATE1("TaskEnterpriseDate1"),
  
  TASKENTERPRISEDATE2("TaskEnterpriseDate2"),
  
  TASKENTERPRISEDATE3("TaskEnterpriseDate3"),
  
  TASKENTERPRISEDATE4("TaskEnterpriseDate4"),
  
  TASKENTERPRISEDATE5("TaskEnterpriseDate5"),
  
  TASKENTERPRISEDATE6("TaskEnterpriseDate6"),
  
  TASKENTERPRISEDATE7("TaskEnterpriseDate7"),
  
  TASKENTERPRISEDATE8("TaskEnterpriseDate8"),
  
  TASKENTERPRISEDATE9("TaskEnterpriseDate9"),
  
  TASKENTERPRISEDATE10("TaskEnterpriseDate10"),
  
  TASKENTERPRISEDATE11("TaskEnterpriseDate11"),
  
  TASKENTERPRISEDATE12("TaskEnterpriseDate12"),
  
  TASKENTERPRISEDATE13("TaskEnterpriseDate13"),
  
  TASKENTERPRISEDATE14("TaskEnterpriseDate14"),
  
  TASKENTERPRISEDATE15("TaskEnterpriseDate15"),
  
  TASKENTERPRISEDATE16("TaskEnterpriseDate16"),
  
  TASKENTERPRISEDATE17("TaskEnterpriseDate17"),
  
  TASKENTERPRISEDATE18("TaskEnterpriseDate18"),
  
  TASKENTERPRISEDATE19("TaskEnterpriseDate19"),
  
  TASKENTERPRISEDATE20("TaskEnterpriseDate20"),
  
  TASKENTERPRISEDATE21("TaskEnterpriseDate21"),
  
  TASKENTERPRISEDATE22("TaskEnterpriseDate22"),
  
  TASKENTERPRISEDATE23("TaskEnterpriseDate23"),
  
  TASKENTERPRISEDATE24("TaskEnterpriseDate24"),
  
  TASKENTERPRISEDATE25("TaskEnterpriseDate25"),
  
  TASKENTERPRISEDATE26("TaskEnterpriseDate26"),
  
  TASKENTERPRISEDATE27("TaskEnterpriseDate27"),
  
  TASKENTERPRISEDATE28("TaskEnterpriseDate28"),
  
  TASKENTERPRISEDATE29("TaskEnterpriseDate29"),
  
  TASKENTERPRISEDATE30("TaskEnterpriseDate30"),
  
  TASKENTERPRISEDURATION1("TaskEnterpriseDuration1"),
  
  TASKENTERPRISEDURATION2("TaskEnterpriseDuration2"),
  
  TASKENTERPRISEDURATION3("TaskEnterpriseDuration3"),
  
  TASKENTERPRISEDURATION4("TaskEnterpriseDuration4"),
  
  TASKENTERPRISEDURATION5("TaskEnterpriseDuration5"),
  
  TASKENTERPRISEDURATION6("TaskEnterpriseDuration6"),
  
  TASKENTERPRISEDURATION7("TaskEnterpriseDuration7"),
  
  TASKENTERPRISEDURATION8("TaskEnterpriseDuration8"),
  
  TASKENTERPRISEDURATION9("TaskEnterpriseDuration9"),
  
  TASKENTERPRISEDURATION10("TaskEnterpriseDuration10"),
  
  TASKENTERPRISEFLAG1("TaskEnterpriseFlag1"),
  
  TASKENTERPRISEFLAG2("TaskEnterpriseFlag2"),
  
  TASKENTERPRISEFLAG3("TaskEnterpriseFlag3"),
  
  TASKENTERPRISEFLAG4("TaskEnterpriseFlag4"),
  
  TASKENTERPRISEFLAG5("TaskEnterpriseFlag5"),
  
  TASKENTERPRISEFLAG6("TaskEnterpriseFlag6"),
  
  TASKENTERPRISEFLAG7("TaskEnterpriseFlag7"),
  
  TASKENTERPRISEFLAG8("TaskEnterpriseFlag8"),
  
  TASKENTERPRISEFLAG9("TaskEnterpriseFlag9"),
  
  TASKENTERPRISEFLAG10("TaskEnterpriseFlag10"),
  
  TASKENTERPRISEFLAG11("TaskEnterpriseFlag11"),
  
  TASKENTERPRISEFLAG12("TaskEnterpriseFlag12"),
  
  TASKENTERPRISEFLAG13("TaskEnterpriseFlag13"),
  
  TASKENTERPRISEFLAG14("TaskEnterpriseFlag14"),
  
  TASKENTERPRISEFLAG15("TaskEnterpriseFlag15"),
  
  TASKENTERPRISEFLAG16("TaskEnterpriseFlag16"),
  
  TASKENTERPRISEFLAG17("TaskEnterpriseFlag17"),
  
  TASKENTERPRISEFLAG18("TaskEnterpriseFlag18"),
  
  TASKENTERPRISEFLAG19("TaskEnterpriseFlag19"),
  
  TASKENTERPRISEFLAG20("TaskEnterpriseFlag20"),
  
  TASKENTERPRISENUMBER1("TaskEnterpriseNumber1"),
  
  TASKENTERPRISENUMBER2("TaskEnterpriseNumber2"),
  
  TASKENTERPRISENUMBER3("TaskEnterpriseNumber3"),
  
  TASKENTERPRISENUMBER4("TaskEnterpriseNumber4"),
  
  TASKENTERPRISENUMBER5("TaskEnterpriseNumber5"),
  
  TASKENTERPRISENUMBER6("TaskEnterpriseNumber6"),
  
  TASKENTERPRISENUMBER7("TaskEnterpriseNumber7"),
  
  TASKENTERPRISENUMBER8("TaskEnterpriseNumber8"),
  
  TASKENTERPRISENUMBER9("TaskEnterpriseNumber9"),
  
  TASKENTERPRISENUMBER10("TaskEnterpriseNumber10"),
  
  TASKENTERPRISENUMBER11("TaskEnterpriseNumber11"),
  
  TASKENTERPRISENUMBER12("TaskEnterpriseNumber12"),
  
  TASKENTERPRISENUMBER13("TaskEnterpriseNumber13"),
  
  TASKENTERPRISENUMBER14("TaskEnterpriseNumber14"),
  
  TASKENTERPRISENUMBER15("TaskEnterpriseNumber15"),
  
  TASKENTERPRISENUMBER16("TaskEnterpriseNumber16"),
  
  TASKENTERPRISENUMBER17("TaskEnterpriseNumber17"),
  
  TASKENTERPRISENUMBER18("TaskEnterpriseNumber18"),
  
  TASKENTERPRISENUMBER19("TaskEnterpriseNumber19"),
  
  TASKENTERPRISENUMBER20("TaskEnterpriseNumber20"),
  
  TASKENTERPRISENUMBER21("TaskEnterpriseNumber21"),
  
  TASKENTERPRISENUMBER22("TaskEnterpriseNumber22"),
  
  TASKENTERPRISENUMBER23("TaskEnterpriseNumber23"),
  
  TASKENTERPRISENUMBER24("TaskEnterpriseNumber24"),
  
  TASKENTERPRISENUMBER25("TaskEnterpriseNumber25"),
  
  TASKENTERPRISENUMBER26("TaskEnterpriseNumber26"),
  
  TASKENTERPRISENUMBER27("TaskEnterpriseNumber27"),
  
  TASKENTERPRISENUMBER28("TaskEnterpriseNumber28"),
  
  TASKENTERPRISENUMBER29("TaskEnterpriseNumber29"),
  
  TASKENTERPRISENUMBER30("TaskEnterpriseNumber30"),
  
  TASKENTERPRISENUMBER31("TaskEnterpriseNumber31"),
  
  TASKENTERPRISENUMBER32("TaskEnterpriseNumber32"),
  
  TASKENTERPRISENUMBER33("TaskEnterpriseNumber33"),
  
  TASKENTERPRISENUMBER34("TaskEnterpriseNumber34"),
  
  TASKENTERPRISENUMBER35("TaskEnterpriseNumber35"),
  
  TASKENTERPRISENUMBER36("TaskEnterpriseNumber36"),
  
  TASKENTERPRISENUMBER37("TaskEnterpriseNumber37"),
  
  TASKENTERPRISENUMBER38("TaskEnterpriseNumber38"),
  
  TASKENTERPRISENUMBER39("TaskEnterpriseNumber39"),
  
  TASKENTERPRISENUMBER40("TaskEnterpriseNumber40"),
  
  TASKENTERPRISEOUTLINECODE1("TaskEnterpriseOutlineCode1"),
  
  TASKENTERPRISEOUTLINECODE2("TaskEnterpriseOutlineCode2"),
  
  TASKENTERPRISEOUTLINECODE3("TaskEnterpriseOutlineCode3"),
  
  TASKENTERPRISEOUTLINECODE4("TaskEnterpriseOutlineCode4"),
  
  TASKENTERPRISEOUTLINECODE5("TaskEnterpriseOutlineCode5"),
  
  TASKENTERPRISEOUTLINECODE6("TaskEnterpriseOutlineCode6"),
  
  TASKENTERPRISEOUTLINECODE7("TaskEnterpriseOutlineCode7"),
  
  TASKENTERPRISEOUTLINECODE8("TaskEnterpriseOutlineCode8"),
  
  TASKENTERPRISEOUTLINECODE9("TaskEnterpriseOutlineCode9"),
  
  TASKENTERPRISEOUTLINECODE10("TaskEnterpriseOutlineCode10"),
  
  TASKENTERPRISEOUTLINECODE11("TaskEnterpriseOutlineCode11"),
  
  TASKENTERPRISEOUTLINECODE12("TaskEnterpriseOutlineCode12"),
  
  TASKENTERPRISEOUTLINECODE13("TaskEnterpriseOutlineCode13"),
  
  TASKENTERPRISEOUTLINECODE14("TaskEnterpriseOutlineCode14"),
  
  TASKENTERPRISEOUTLINECODE15("TaskEnterpriseOutlineCode15"),
  
  TASKENTERPRISEOUTLINECODE16("TaskEnterpriseOutlineCode16"),
  
  TASKENTERPRISEOUTLINECODE17("TaskEnterpriseOutlineCode17"),
  
  TASKENTERPRISEOUTLINECODE18("TaskEnterpriseOutlineCode18"),
  
  TASKENTERPRISEOUTLINECODE19("TaskEnterpriseOutlineCode19"),
  
  TASKENTERPRISEOUTLINECODE20("TaskEnterpriseOutlineCode20"),
  
  TASKENTERPRISEOUTLINECODE21("TaskEnterpriseOutlineCode21"),
  
  TASKENTERPRISEOUTLINECODE22("TaskEnterpriseOutlineCode22"),
  
  TASKENTERPRISEOUTLINECODE23("TaskEnterpriseOutlineCode23"),
  
  TASKENTERPRISEOUTLINECODE24("TaskEnterpriseOutlineCode24"),
  
  TASKENTERPRISEOUTLINECODE25("TaskEnterpriseOutlineCode25"),
  
  TASKENTERPRISEOUTLINECODE26("TaskEnterpriseOutlineCode26"),
  
  TASKENTERPRISEOUTLINECODE27("TaskEnterpriseOutlineCode27"),
  
  TASKENTERPRISEOUTLINECODE28("TaskEnterpriseOutlineCode28"),
  
  TASKENTERPRISEOUTLINECODE29("TaskEnterpriseOutlineCode29"),
  
  TASKENTERPRISEOUTLINECODE30("TaskEnterpriseOutlineCode30"),
  
  TASKENTERPRISETEXT1("TaskEnterpriseText1"),
  
  TASKENTERPRISETEXT2("TaskEnterpriseText2"),
  
  TASKENTERPRISETEXT3("TaskEnterpriseText3"),
  
  TASKENTERPRISETEXT4("TaskEnterpriseText4"),
  
  TASKENTERPRISETEXT5("TaskEnterpriseText5"),
  
  TASKENTERPRISETEXT6("TaskEnterpriseText6"),
  
  TASKENTERPRISETEXT7("TaskEnterpriseText7"),
  
  TASKENTERPRISETEXT8("TaskEnterpriseText8"),
  
  TASKENTERPRISETEXT9("TaskEnterpriseText9"),
  
  TASKENTERPRISETEXT10("TaskEnterpriseText10"),
  
  TASKENTERPRISETEXT11("TaskEnterpriseText11"),
  
  TASKENTERPRISETEXT12("TaskEnterpriseText12"),
  
  TASKENTERPRISETEXT13("TaskEnterpriseText13"),
  
  TASKENTERPRISETEXT14("TaskEnterpriseText14"),
  
  TASKENTERPRISETEXT15("TaskEnterpriseText15"),
  
  TASKENTERPRISETEXT16("TaskEnterpriseText16"),
  
  TASKENTERPRISETEXT17("TaskEnterpriseText17"),
  
  TASKENTERPRISETEXT18("TaskEnterpriseText18"),
  
  TASKENTERPRISETEXT19("TaskEnterpriseText19"),
  
  TASKENTERPRISETEXT20("TaskEnterpriseText20"),
  
  TASKENTERPRISETEXT21("TaskEnterpriseText21"),
  
  TASKENTERPRISETEXT22("TaskEnterpriseText22"),
  
  TASKENTERPRISETEXT23("TaskEnterpriseText23"),
  
  TASKENTERPRISETEXT24("TaskEnterpriseText24"),
  
  TASKENTERPRISETEXT25("TaskEnterpriseText25"),
  
  TASKENTERPRISETEXT26("TaskEnterpriseText26"),
  
  TASKENTERPRISETEXT27("TaskEnterpriseText27"),
  
  TASKENTERPRISETEXT28("TaskEnterpriseText28"),
  
  TASKENTERPRISETEXT29("TaskEnterpriseText29"),
  
  TASKENTERPRISETEXT30("TaskEnterpriseText30"),
  
  TASKENTERPRISETEXT31("TaskEnterpriseText31"),
  
  TASKENTERPRISETEXT32("TaskEnterpriseText32"),
  
  TASKENTERPRISETEXT33("TaskEnterpriseText33"),
  
  TASKENTERPRISETEXT34("TaskEnterpriseText34"),
  
  TASKENTERPRISETEXT35("TaskEnterpriseText35"),
  
  TASKENTERPRISETEXT36("TaskEnterpriseText36"),
  
  TASKENTERPRISETEXT37("TaskEnterpriseText37"),
  
  TASKENTERPRISETEXT38("TaskEnterpriseText38"),
  
  TASKENTERPRISETEXT39("TaskEnterpriseText39"),
  
  TASKENTERPRISETEXT40("TaskEnterpriseText40"),
  
  TASKBASELINE1DURATIONESTIMATED("TaskBaseline1DurationEstimated"),
  
  TASKBASELINE2DURATIONESTIMATED("TaskBaseline2DurationEstimated"),
  
  TASKBASELINE3DURATIONESTIMATED("TaskBaseline3DurationEstimated"),
  
  TASKBASELINE4DURATIONESTIMATED("TaskBaseline4DurationEstimated"),
  
  TASKBASELINE5DURATIONESTIMATED("TaskBaseline5DurationEstimated"),
  
  TASKBASELINE6DURATIONESTIMATED("TaskBaseline6DurationEstimated"),
  
  TASKBASELINE7DURATIONESTIMATED("TaskBaseline7DurationEstimated"),
  
  TASKBASELINE8DURATIONESTIMATED("TaskBaseline8DurationEstimated"),
  
  TASKBASELINE9DURATIONESTIMATED("TaskBaseline9DurationEstimated"),
  
  TASKBASELINE10DURATIONESTIMATED("TaskBaseline10DurationEstimated"),
  
  TASKENTERPRISEPROJECTCOST1("TaskEnterpriseProjectCost1"),
  
  TASKENTERPRISEPROJECTCOST2("TaskEnterpriseProjectCost2"),
  
  TASKENTERPRISEPROJECTCOST3("TaskEnterpriseProjectCost3"),
  
  TASKENTERPRISEPROJECTCOST4("TaskEnterpriseProjectCost4"),
  
  TASKENTERPRISEPROJECTCOST5("TaskEnterpriseProjectCost5"),
  
  TASKENTERPRISEPROJECTCOST6("TaskEnterpriseProjectCost6"),
  
  TASKENTERPRISEPROJECTCOST7("TaskEnterpriseProjectCost7"),
  
  TASKENTERPRISEPROJECTCOST8("TaskEnterpriseProjectCost8"),
  
  TASKENTERPRISEPROJECTCOST9("TaskEnterpriseProjectCost9"),
  
  TASKENTERPRISEPROJECTCOST10("TaskEnterpriseProjectCost10"),
  
  TASKENTERPRISEPROJECTDATE1("TaskEnterpriseProjectDate1"),
  
  TASKENTERPRISEPROJECTDATE2("TaskEnterpriseProjectDate2"),
  
  TASKENTERPRISEPROJECTDATE3("TaskEnterpriseProjectDate3"),
  
  TASKENTERPRISEPROJECTDATE4("TaskEnterpriseProjectDate4"),
  
  TASKENTERPRISEPROJECTDATE5("TaskEnterpriseProjectDate5"),
  
  TASKENTERPRISEPROJECTDATE6("TaskEnterpriseProjectDate6"),
  
  TASKENTERPRISEPROJECTDATE7("TaskEnterpriseProjectDate7"),
  
  TASKENTERPRISEPROJECTDATE8("TaskEnterpriseProjectDate8"),
  
  TASKENTERPRISEPROJECTDATE9("TaskEnterpriseProjectDate9"),
  
  TASKENTERPRISEPROJECTDATE10("TaskEnterpriseProjectDate10"),
  
  TASKENTERPRISEPROJECTDATE11("TaskEnterpriseProjectDate11"),
  
  TASKENTERPRISEPROJECTDATE12("TaskEnterpriseProjectDate12"),
  
  TASKENTERPRISEPROJECTDATE13("TaskEnterpriseProjectDate13"),
  
  TASKENTERPRISEPROJECTDATE14("TaskEnterpriseProjectDate14"),
  
  TASKENTERPRISEPROJECTDATE15("TaskEnterpriseProjectDate15"),
  
  TASKENTERPRISEPROJECTDATE16("TaskEnterpriseProjectDate16"),
  
  TASKENTERPRISEPROJECTDATE17("TaskEnterpriseProjectDate17"),
  
  TASKENTERPRISEPROJECTDATE18("TaskEnterpriseProjectDate18"),
  
  TASKENTERPRISEPROJECTDATE19("TaskEnterpriseProjectDate19"),
  
  TASKENTERPRISEPROJECTDATE20("TaskEnterpriseProjectDate20"),
  
  TASKENTERPRISEPROJECTDATE21("TaskEnterpriseProjectDate21"),
  
  TASKENTERPRISEPROJECTDATE22("TaskEnterpriseProjectDate22"),
  
  TASKENTERPRISEPROJECTDATE23("TaskEnterpriseProjectDate23"),
  
  TASKENTERPRISEPROJECTDATE24("TaskEnterpriseProjectDate24"),
  
  TASKENTERPRISEPROJECTDATE25("TaskEnterpriseProjectDate25"),
  
  TASKENTERPRISEPROJECTDATE26("TaskEnterpriseProjectDate26"),
  
  TASKENTERPRISEPROJECTDATE27("TaskEnterpriseProjectDate27"),
  
  TASKENTERPRISEPROJECTDATE28("TaskEnterpriseProjectDate28"),
  
  TASKENTERPRISEPROJECTDATE29("TaskEnterpriseProjectDate29"),
  
  TASKENTERPRISEPROJECTDATE30("TaskEnterpriseProjectDate30"),
  
  TASKENTERPRISEPROJECTDURATION1("TaskEnterpriseProjectDuration1"),
  
  TASKENTERPRISEPROJECTDURATION2("TaskEnterpriseProjectDuration2"),
  
  TASKENTERPRISEPROJECTDURATION3("TaskEnterpriseProjectDuration3"),
  
  TASKENTERPRISEPROJECTDURATION4("TaskEnterpriseProjectDuration4"),
  
  TASKENTERPRISEPROJECTDURATION5("TaskEnterpriseProjectDuration5"),
  
  TASKENTERPRISEPROJECTDURATION6("TaskEnterpriseProjectDuration6"),
  
  TASKENTERPRISEPROJECTDURATION7("TaskEnterpriseProjectDuration7"),
  
  TASKENTERPRISEPROJECTDURATION8("TaskEnterpriseProjectDuration8"),
  
  TASKENTERPRISEPROJECTDURATION9("TaskEnterpriseProjectDuration9"),
  
  TASKENTERPRISEPROJECTDURATION10("TaskEnterpriseProjectDuration10"),
  
  TASKENTERPRISEPROJECTOUTLINECODE1("TaskEnterpriseProjectOutlineCode1"),
  
  TASKENTERPRISEPROJECTOUTLINECODE2("TaskEnterpriseProjectOutlineCode2"),
  
  TASKENTERPRISEPROJECTOUTLINECODE3("TaskEnterpriseProjectOutlineCode3"),
  
  TASKENTERPRISEPROJECTOUTLINECODE4("TaskEnterpriseProjectOutlineCode4"),
  
  TASKENTERPRISEPROJECTOUTLINECODE5("TaskEnterpriseProjectOutlineCode5"),
  
  TASKENTERPRISEPROJECTOUTLINECODE6("TaskEnterpriseProjectOutlineCode6"),
  
  TASKENTERPRISEPROJECTOUTLINECODE7("TaskEnterpriseProjectOutlineCode7"),
  
  TASKENTERPRISEPROJECTOUTLINECODE8("TaskEnterpriseProjectOutlineCode8"),
  
  TASKENTERPRISEPROJECTOUTLINECODE9("TaskEnterpriseProjectOutlineCode9"),
  
  TASKENTERPRISEPROJECTOUTLINECODE10("TaskEnterpriseProjectOutlineCode10"),
  
  TASKENTERPRISEPROJECTOUTLINECODE11("TaskEnterpriseProjectOutlineCode11"),
  
  TASKENTERPRISEPROJECTOUTLINECODE12("TaskEnterpriseProjectOutlineCode12"),
  
  TASKENTERPRISEPROJECTOUTLINECODE13("TaskEnterpriseProjectOutlineCode13"),
  
  TASKENTERPRISEPROJECTOUTLINECODE14("TaskEnterpriseProjectOutlineCode14"),
  
  TASKENTERPRISEPROJECTOUTLINECODE15("TaskEnterpriseProjectOutlineCode15"),
  
  TASKENTERPRISEPROJECTOUTLINECODE16("TaskEnterpriseProjectOutlineCode16"),
  
  TASKENTERPRISEPROJECTOUTLINECODE17("TaskEnterpriseProjectOutlineCode17"),
  
  TASKENTERPRISEPROJECTOUTLINECODE18("TaskEnterpriseProjectOutlineCode18"),
  
  TASKENTERPRISEPROJECTOUTLINECODE19("TaskEnterpriseProjectOutlineCode19"),
  
  TASKENTERPRISEPROJECTOUTLINECODE20("TaskEnterpriseProjectOutlineCode20"),
  
  TASKENTERPRISEPROJECTOUTLINECODE21("TaskEnterpriseProjectOutlineCode21"),
  
  TASKENTERPRISEPROJECTOUTLINECODE22("TaskEnterpriseProjectOutlineCode22"),
  
  TASKENTERPRISEPROJECTOUTLINECODE23("TaskEnterpriseProjectOutlineCode23"),
  
  TASKENTERPRISEPROJECTOUTLINECODE24("TaskEnterpriseProjectOutlineCode24"),
  
  TASKENTERPRISEPROJECTOUTLINECODE25("TaskEnterpriseProjectOutlineCode25"),
  
  TASKENTERPRISEPROJECTOUTLINECODE26("TaskEnterpriseProjectOutlineCode26"),
  
  TASKENTERPRISEPROJECTOUTLINECODE27("TaskEnterpriseProjectOutlineCode27"),
  
  TASKENTERPRISEPROJECTOUTLINECODE28("TaskEnterpriseProjectOutlineCode28"),
  
  TASKENTERPRISEPROJECTOUTLINECODE29("TaskEnterpriseProjectOutlineCode29"),
  
  TASKENTERPRISEPROJECTOUTLINECODE30("TaskEnterpriseProjectOutlineCode30"),
  
  TASKENTERPRISEPROJECTFLAG1("TaskEnterpriseProjectFlag1"),
  
  TASKENTERPRISEPROJECTFLAG2("TaskEnterpriseProjectFlag2"),
  
  TASKENTERPRISEPROJECTFLAG3("TaskEnterpriseProjectFlag3"),
  
  TASKENTERPRISEPROJECTFLAG4("TaskEnterpriseProjectFlag4"),
  
  TASKENTERPRISEPROJECTFLAG5("TaskEnterpriseProjectFlag5"),
  
  TASKENTERPRISEPROJECTFLAG6("TaskEnterpriseProjectFlag6"),
  
  TASKENTERPRISEPROJECTFLAG7("TaskEnterpriseProjectFlag7"),
  
  TASKENTERPRISEPROJECTFLAG8("TaskEnterpriseProjectFlag8"),
  
  TASKENTERPRISEPROJECTFLAG9("TaskEnterpriseProjectFlag9"),
  
  TASKENTERPRISEPROJECTFLAG10("TaskEnterpriseProjectFlag10"),
  
  TASKENTERPRISEPROJECTFLAG11("TaskEnterpriseProjectFlag11"),
  
  TASKENTERPRISEPROJECTFLAG12("TaskEnterpriseProjectFlag12"),
  
  TASKENTERPRISEPROJECTFLAG13("TaskEnterpriseProjectFlag13"),
  
  TASKENTERPRISEPROJECTFLAG14("TaskEnterpriseProjectFlag14"),
  
  TASKENTERPRISEPROJECTFLAG15("TaskEnterpriseProjectFlag15"),
  
  TASKENTERPRISEPROJECTFLAG16("TaskEnterpriseProjectFlag16"),
  
  TASKENTERPRISEPROJECTFLAG17("TaskEnterpriseProjectFlag17"),
  
  TASKENTERPRISEPROJECTFLAG18("TaskEnterpriseProjectFlag18"),
  
  TASKENTERPRISEPROJECTFLAG19("TaskEnterpriseProjectFlag19"),
  
  TASKENTERPRISEPROJECTFLAG20("TaskEnterpriseProjectFlag20"),
  
  TASKENTERPRISEPROJECTNUMBER1("TaskEnterpriseProjectNumber1"),
  
  TASKENTERPRISEPROJECTNUMBER2("TaskEnterpriseProjectNumber2"),
  
  TASKENTERPRISEPROJECTNUMBER3("TaskEnterpriseProjectNumber3"),
  
  TASKENTERPRISEPROJECTNUMBER4("TaskEnterpriseProjectNumber4"),
  
  TASKENTERPRISEPROJECTNUMBER5("TaskEnterpriseProjectNumber5"),
  
  TASKENTERPRISEPROJECTNUMBER6("TaskEnterpriseProjectNumber6"),
  
  TASKENTERPRISEPROJECTNUMBER7("TaskEnterpriseProjectNumber7"),
  
  TASKENTERPRISEPROJECTNUMBER8("TaskEnterpriseProjectNumber8"),
  
  TASKENTERPRISEPROJECTNUMBER9("TaskEnterpriseProjectNumber9"),
  
  TASKENTERPRISEPROJECTNUMBER10("TaskEnterpriseProjectNumber10"),
  
  TASKENTERPRISEPROJECTNUMBER11("TaskEnterpriseProjectNumber11"),
  
  TASKENTERPRISEPROJECTNUMBER12("TaskEnterpriseProjectNumber12"),
  
  TASKENTERPRISEPROJECTNUMBER13("TaskEnterpriseProjectNumber13"),
  
  TASKENTERPRISEPROJECTNUMBER14("TaskEnterpriseProjectNumber14"),
  
  TASKENTERPRISEPROJECTNUMBER15("TaskEnterpriseProjectNumber15"),
  
  TASKENTERPRISEPROJECTNUMBER16("TaskEnterpriseProjectNumber16"),
  
  TASKENTERPRISEPROJECTNUMBER17("TaskEnterpriseProjectNumber17"),
  
  TASKENTERPRISEPROJECTNUMBER18("TaskEnterpriseProjectNumber18"),
  
  TASKENTERPRISEPROJECTNUMBER19("TaskEnterpriseProjectNumber19"),
  
  TASKENTERPRISEPROJECTNUMBER20("TaskEnterpriseProjectNumber20"),
  
  TASKENTERPRISEPROJECTNUMBER21("TaskEnterpriseProjectNumber21"),
  
  TASKENTERPRISEPROJECTNUMBER22("TaskEnterpriseProjectNumber22"),
  
  TASKENTERPRISEPROJECTNUMBER23("TaskEnterpriseProjectNumber23"),
  
  TASKENTERPRISEPROJECTNUMBER24("TaskEnterpriseProjectNumber24"),
  
  TASKENTERPRISEPROJECTNUMBER25("TaskEnterpriseProjectNumber25"),
  
  TASKENTERPRISEPROJECTNUMBER26("TaskEnterpriseProjectNumber26"),
  
  TASKENTERPRISEPROJECTNUMBER27("TaskEnterpriseProjectNumber27"),
  
  TASKENTERPRISEPROJECTNUMBER28("TaskEnterpriseProjectNumber28"),
  
  TASKENTERPRISEPROJECTNUMBER29("TaskEnterpriseProjectNumber29"),
  
  TASKENTERPRISEPROJECTNUMBER30("TaskEnterpriseProjectNumber30"),
  
  TASKENTERPRISEPROJECTNUMBER31("TaskEnterpriseProjectNumber31"),
  
  TASKENTERPRISEPROJECTNUMBER32("TaskEnterpriseProjectNumber32"),
  
  TASKENTERPRISEPROJECTNUMBER33("TaskEnterpriseProjectNumber33"),
  
  TASKENTERPRISEPROJECTNUMBER34("TaskEnterpriseProjectNumber34"),
  
  TASKENTERPRISEPROJECTNUMBER35("TaskEnterpriseProjectNumber35"),
  
  TASKENTERPRISEPROJECTNUMBER36("TaskEnterpriseProjectNumber36"),
  
  TASKENTERPRISEPROJECTNUMBER37("TaskEnterpriseProjectNumber37"),
  
  TASKENTERPRISEPROJECTNUMBER38("TaskEnterpriseProjectNumber38"),
  
  TASKENTERPRISEPROJECTNUMBER39("TaskEnterpriseProjectNumber39"),
  
  TASKENTERPRISEPROJECTNUMBER40("TaskEnterpriseProjectNumber40"),
  
  TASKENTERPRISEPROJECTTEXT1("TaskEnterpriseProjectText1"),
  
  TASKENTERPRISEPROJECTTEXT2("TaskEnterpriseProjectText2"),
  
  TASKENTERPRISEPROJECTTEXT3("TaskEnterpriseProjectText3"),
  
  TASKENTERPRISEPROJECTTEXT4("TaskEnterpriseProjectText4"),
  
  TASKENTERPRISEPROJECTTEXT5("TaskEnterpriseProjectText5"),
  
  TASKENTERPRISEPROJECTTEXT6("TaskEnterpriseProjectText6"),
  
  TASKENTERPRISEPROJECTTEXT7("TaskEnterpriseProjectText7"),
  
  TASKENTERPRISEPROJECTTEXT8("TaskEnterpriseProjectText8"),
  
  TASKENTERPRISEPROJECTTEXT9("TaskEnterpriseProjectText9"),
  
  TASKENTERPRISEPROJECTTEXT10("TaskEnterpriseProjectText10"),
  
  TASKENTERPRISEPROJECTTEXT11("TaskEnterpriseProjectText11"),
  
  TASKENTERPRISEPROJECTTEXT12("TaskEnterpriseProjectText12"),
  
  TASKENTERPRISEPROJECTTEXT13("TaskEnterpriseProjectText13"),
  
  TASKENTERPRISEPROJECTTEXT14("TaskEnterpriseProjectText14"),
  
  TASKENTERPRISEPROJECTTEXT15("TaskEnterpriseProjectText15"),
  
  TASKENTERPRISEPROJECTTEXT16("TaskEnterpriseProjectText16"),
  
  TASKENTERPRISEPROJECTTEXT17("TaskEnterpriseProjectText17"),
  
  TASKENTERPRISEPROJECTTEXT18("TaskEnterpriseProjectText18"),
  
  TASKENTERPRISEPROJECTTEXT19("TaskEnterpriseProjectText19"),
  
  TASKENTERPRISEPROJECTTEXT20("TaskEnterpriseProjectText20"),
  
  TASKENTERPRISEPROJECTTEXT21("TaskEnterpriseProjectText21"),
  
  TASKENTERPRISEPROJECTTEXT22("TaskEnterpriseProjectText22"),
  
  TASKENTERPRISEPROJECTTEXT23("TaskEnterpriseProjectText23"),
  
  TASKENTERPRISEPROJECTTEXT24("TaskEnterpriseProjectText24"),
  
  TASKENTERPRISEPROJECTTEXT25("TaskEnterpriseProjectText25"),
  
  TASKENTERPRISEPROJECTTEXT26("TaskEnterpriseProjectText26"),
  
  TASKENTERPRISEPROJECTTEXT27("TaskEnterpriseProjectText27"),
  
  TASKENTERPRISEPROJECTTEXT28("TaskEnterpriseProjectText28"),
  
  TASKENTERPRISEPROJECTTEXT29("TaskEnterpriseProjectText29"),
  
  TASKENTERPRISEPROJECTTEXT30("TaskEnterpriseProjectText30"),
  
  TASKENTERPRISEPROJECTTEXT31("TaskEnterpriseProjectText31"),
  
  TASKENTERPRISEPROJECTTEXT32("TaskEnterpriseProjectText32"),
  
  TASKENTERPRISEPROJECTTEXT33("TaskEnterpriseProjectText33"),
  
  TASKENTERPRISEPROJECTTEXT34("TaskEnterpriseProjectText34"),
  
  TASKENTERPRISEPROJECTTEXT35("TaskEnterpriseProjectText35"),
  
  TASKENTERPRISEPROJECTTEXT36("TaskEnterpriseProjectText36"),
  
  TASKENTERPRISEPROJECTTEXT37("TaskEnterpriseProjectText37"),
  
  TASKENTERPRISEPROJECTTEXT38("TaskEnterpriseProjectText38"),
  
  TASKENTERPRISEPROJECTTEXT39("TaskEnterpriseProjectText39"),
  
  TASKENTERPRISEPROJECTTEXT40("TaskEnterpriseProjectText40"),
  
  TASKRESOURCEENTERPRISEOUTLINECODE1("TaskResourceEnterpriseOutlineCode1"),
  
  TASKRESOURCEENTERPRISEOUTLINECODE2("TaskResourceEnterpriseOutlineCode2"),
  
  TASKRESOURCEENTERPRISEOUTLINECODE3("TaskResourceEnterpriseOutlineCode3"),
  
  TASKRESOURCEENTERPRISEOUTLINECODE4("TaskResourceEnterpriseOutlineCode4"),
  
  TASKRESOURCEENTERPRISEOUTLINECODE5("TaskResourceEnterpriseOutlineCode5"),
  
  TASKRESOURCEENTERPRISEOUTLINECODE6("TaskResourceEnterpriseOutlineCode6"),
  
  TASKRESOURCEENTERPRISEOUTLINECODE7("TaskResourceEnterpriseOutlineCode7"),
  
  TASKRESOURCEENTERPRISEOUTLINECODE8("TaskResourceEnterpriseOutlineCode8"),
  
  TASKRESOURCEENTERPRISEOUTLINECODE9("TaskResourceEnterpriseOutlineCode9"),
  
  TASKRESOURCEENTERPRISEOUTLINECODE10("TaskResourceEnterpriseOutlineCode10"),
  
  TASKRESOURCEENTERPRISEOUTLINECODE11("TaskResourceEnterpriseOutlineCode11"),
  
  TASKRESOURCEENTERPRISEOUTLINECODE12("TaskResourceEnterpriseOutlineCode12"),
  
  TASKRESOURCEENTERPRISEOUTLINECODE13("TaskResourceEnterpriseOutlineCode13"),
  
  TASKRESOURCEENTERPRISEOUTLINECODE14("TaskResourceEnterpriseOutlineCode14"),
  
  TASKRESOURCEENTERPRISEOUTLINECODE15("TaskResourceEnterpriseOutlineCode15"),
  
  TASKRESOURCEENTERPRISEOUTLINECODE16("TaskResourceEnterpriseOutlineCode16"),
  
  TASKRESOURCEENTERPRISEOUTLINECODE17("TaskResourceEnterpriseOutlineCode17"),
  
  TASKRESOURCEENTERPRISEOUTLINECODE18("TaskResourceEnterpriseOutlineCode18"),
  
  TASKRESOURCEENTERPRISEOUTLINECODE19("TaskResourceEnterpriseOutlineCode19"),
  
  TASKRESOURCEENTERPRISEOUTLINECODE20("TaskResourceEnterpriseOutlineCode20"),
  
  TASKRESOURCEENTERPRISEOUTLINECODE21("TaskResourceEnterpriseOutlineCode21"),
  
  TASKRESOURCEENTERPRISEOUTLINECODE22("TaskResourceEnterpriseOutlineCode22"),
  
  TASKRESOURCEENTERPRISEOUTLINECODE23("TaskResourceEnterpriseOutlineCode23"),
  
  TASKRESOURCEENTERPRISEOUTLINECODE24("TaskResourceEnterpriseOutlineCode24"),
  
  TASKRESOURCEENTERPRISEOUTLINECODE25("TaskResourceEnterpriseOutlineCode25"),
  
  TASKRESOURCEENTERPRISEOUTLINECODE26("TaskResourceEnterpriseOutlineCode26"),
  
  TASKRESOURCEENTERPRISEOUTLINECODE27("TaskResourceEnterpriseOutlineCode27"),
  
  TASKRESOURCEENTERPRISEOUTLINECODE28("TaskResourceEnterpriseOutlineCode28"),
  
  TASKRESOURCEENTERPRISEOUTLINECODE29("TaskResourceEnterpriseOutlineCode29"),
  
  TASKRESOURCEENTERPRISERBS("TaskResourceEnterpriseRBS"),
  
  TASKPHYSICALPERCENTCOMPLETE("TaskPhysicalPercentComplete"),
  
  TASKDEMANDEDREQUESTED("TaskDemandedRequested"),
  
  TASKSTATUSINDICATOR("TaskStatusIndicator"),
  
  TASKEARNEDVALUEMETHOD("TaskEarnedValueMethod"),
  
  TASKRESOURCEENTERPRISEMULTIVALUECODE20("TaskResourceEnterpriseMultiValueCode20"),
  
  TASKRESOURCEENTERPRISEMULTIVALUECODE21("TaskResourceEnterpriseMultiValueCode21"),
  
  TASKRESOURCEENTERPRISEMULTIVALUECODE22("TaskResourceEnterpriseMultiValueCode22"),
  
  TASKRESOURCEENTERPRISEMULTIVALUECODE23("TaskResourceEnterpriseMultiValueCode23"),
  
  TASKRESOURCEENTERPRISEMULTIVALUECODE24("TaskResourceEnterpriseMultiValueCode24"),
  
  TASKRESOURCEENTERPRISEMULTIVALUECODE25("TaskResourceEnterpriseMultiValueCode25"),
  
  TASKRESOURCEENTERPRISEMULTIVALUECODE26("TaskResourceEnterpriseMultiValueCode26"),
  
  TASKRESOURCEENTERPRISEMULTIVALUECODE27("TaskResourceEnterpriseMultiValueCode27"),
  
  TASKRESOURCEENTERPRISEMULTIVALUECODE28("TaskResourceEnterpriseMultiValueCode28"),
  
  TASKRESOURCEENTERPRISEMULTIVALUECODE29("TaskResourceEnterpriseMultiValueCode29"),
  
  TASKACTUALWORKPROTECTED("TaskActualWorkProtected"),
  
  TASKACTUALOVERTIMEWORKPROTECTED("TaskActualOvertimeWorkProtected"),
  
  TASKGUID("TaskGuid"),
  
  TASKCALENDARGUID("TaskCalendarGuid"),
  
  TASKDELIVERABLEGUID("TaskDeliverableGuid"),
  
  TASKDELIVERABLETYPE("TaskDeliverableType"),
  
  TASKDELIVERABLESTART("TaskDeliverableStart"),
  
  TASKDELIVERABLEFINISH("TaskDeliverableFinish"),
  
  TASKISPUBLISHED("TaskIsPublished"),
  
  TASKSTATUSMANAGERNAME("TaskStatusManagerName"),
  
  TASKERRORMESSAGE("TaskErrorMessage"),
  
  TASKASSIGNMENTOWNER("TaskAssignmentOwner"),
  
  TASKBUDGETWORK("TaskBudgetWork"),
  
  TASKBUDGETCOST("TaskBudgetCost"),
  
  TASKBASELINEFIXEDCOSTACCRUAL("TaskBaselineFixedCostAccrual"),
  
  TASKBASELINEDELIVERABLESTART("TaskBaselineDeliverableStart"),
  
  TASKBASELINEDELIVERABLEFINISH("TaskBaselineDeliverableFinish"),
  
  TASKBASELINEBUDGETWORK("TaskBaselineBudgetWork"),
  
  TASKBASELINEBUDGETCOST("TaskBaselineBudgetCost"),
  
  TASKBASELINE1FIXEDCOSTACCRUAL("TaskBaseline1FixedCostAccrual"),
  
  TASKBASELINE1DELIVERABLESTART("TaskBaseline1DeliverableStart"),
  
  TASKBASELINE1DELIVERABLEFINISH("TaskBaseline1DeliverableFinish"),
  
  TASKBASELINE1BUDGETWORK("TaskBaseline1BudgetWork"),
  
  TASKBASELINE1BUDGETCOST("TaskBaseline1BudgetCost"),
  
  TASKBASELINE2FIXEDCOSTACCRUAL("TaskBaseline2FixedCostAccrual"),
  
  TASKBASELINE2DELIVERABLESTART("TaskBaseline2DeliverableStart"),
  
  TASKBASELINE2DELIVERABLEFINISH("TaskBaseline2DeliverableFinish"),
  
  TASKBASELINE2BUDGETWORK("TaskBaseline2BudgetWork"),
  
  TASKBASELINE2BUDGETCOST("TaskBaseline2BudgetCost"),
  
  TASKBASELINE3FIXEDCOSTACCRUAL("TaskBaseline3FixedCostAccrual"),
  
  TASKBASELINE3DELIVERABLESTART("TaskBaseline3DeliverableStart"),
  
  TASKBASELINE3DELIVERABLEFINISH("TaskBaseline3DeliverableFinish"),
  
  TASKBASELINE3BUDGETWORK("TaskBaseline3BudgetWork"),
  
  TASKBASELINE3BUDGETCOST("TaskBaseline3BudgetCost"),
  
  TASKBASELINE4FIXEDCOSTACCRUAL("TaskBaseline4FixedCostAccrual"),
  
  TASKBASELINE4DELIVERABLESTART("TaskBaseline4DeliverableStart"),
  
  TASKBASELINE4DELIVERABLEFINISH("TaskBaseline4DeliverableFinish"),
  
  TASKBASELINE4BUDGETWORK("TaskBaseline4BudgetWork"),
  
  TASKBASELINE4BUDGETCOST("TaskBaseline4BudgetCost"),
  
  TASKBASELINE5FIXEDCOSTACCRUAL("TaskBaseline5FixedCostAccrual"),
  
  TASKBASELINE5DELIVERABLESTART("TaskBaseline5DeliverableStart"),
  
  TASKBASELINE5DELIVERABLEFINISH("TaskBaseline5DeliverableFinish"),
  
  TASKBASELINE5BUDGETWORK("TaskBaseline5BudgetWork"),
  
  TASKBASELINE5BUDGETCOST("TaskBaseline5BudgetCost"),
  
  TASKBASELINE6FIXEDCOSTACCRUAL("TaskBaseline6FixedCostAccrual"),
  
  TASKBASELINE6DELIVERABLESTART("TaskBaseline6DeliverableStart"),
  
  TASKBASELINE6DELIVERABLEFINISH("TaskBaseline6DeliverableFinish"),
  
  TASKBASELINE6BUDGETWORK("TaskBaseline6BudgetWork"),
  
  TASKBASELINE6BUDGETCOST("TaskBaseline6BudgetCost"),
  
  TASKBASELINE7FIXEDCOSTACCRUAL("TaskBaseline7FixedCostAccrual"),
  
  TASKBASELINE7DELIVERABLESTART("TaskBaseline7DeliverableStart"),
  
  TASKBASELINE7DELIVERABLEFINISH("TaskBaseline7DeliverableFinish"),
  
  TASKBASELINE7BUDGETWORK("TaskBaseline7BudgetWork"),
  
  TASKBASELINE7BUDGETCOST("TaskBaseline7BudgetCost"),
  
  TASKBASELINE8FIXEDCOSTACCRUAL("TaskBaseline8FixedCostAccrual"),
  
  TASKBASELINE8DELIVERABLESTART("TaskBaseline8DeliverableStart"),
  
  TASKBASELINE8DELIVERABLEFINISH("TaskBaseline8DeliverableFinish"),
  
  TASKBASELINE8BUDGETWORK("TaskBaseline8BudgetWork"),
  
  TASKBASELINE8BUDGETCOST("TaskBaseline8BudgetCost"),
  
  TASKBASELINE9FIXEDCOSTACCRUAL("TaskBaseline9FixedCostAccrual"),
  
  TASKBASELINE9DELIVERABLESTART("TaskBaseline9DeliverableStart"),
  
  TASKBASELINE9DELIVERABLEFINISH("TaskBaseline9DeliverableFinish"),
  
  TASKBASELINE9BUDGETWORK("TaskBaseline9BudgetWork"),
  
  TASKBASELINE9BUDGETCOST("TaskBaseline9BudgetCost"),
  
  TASKBASELINE10FIXEDCOSTACCRUAL("TaskBaseline10FixedCostAccrual"),
  
  TASKBASELINE10DELIVERABLESTART("TaskBaseline10DeliverableStart"),
  
  TASKBASELINE10DELIVERABLEFINISH("TaskBaseline10DeliverableFinish"),
  
  TASKBASELINE10BUDGETWORK("TaskBaseline10BudgetWork"),
  
  TASKBASELINE10BUDGETCOST("TaskBaseline10BudgetCost"),
  
  TASKRECALCFLAGS("TaskRecalcFlags"),
  
  TASKDELIVERABLENAME("TaskDeliverableName"),
  
  TASKACTIVE("TaskActive"),
  
  TASKMANUAL("TaskManual"),
  
  TASKPLACEHOLDER("TaskPlaceholder"),
  
  TASKWARNING("TaskWarning"),
  
  TASKSTARTTEXT("TaskStartText"),
  
  TASKFINISHTEXT("TaskFinishText"),
  
  TASKDURATIONTEXT("TaskDurationText"),
  
  TASKISSTARTVALID("TaskIsStartValid"),
  
  TASKISFINISHVALID("TaskIsFinishValid"),
  
  TASKISDURATIONVALID("TaskIsDurationValid"),
  
  TASKBASELINESTARTTEXT("TaskBaselineStartText"),
  
  TASKBASELINEFINISHTEXT("TaskBaselineFinishText"),
  
  TASKBASELINEDURATIONTEXT("TaskBaselineDurationText"),
  
  TASKBASELINE1STARTTEXT("TaskBaseline1StartText"),
  
  TASKBASELINE1FINISHTEXT("TaskBaseline1FinishText"),
  
  TASKBASELINE1DURATIONTEXT("TaskBaseline1DurationText"),
  
  TASKBASELINE2STARTTEXT("TaskBaseline2StartText"),
  
  TASKBASELINE2FINISHTEXT("TaskBaseline2FinishText"),
  
  TASKBASELINE2DURATIONTEXT("TaskBaseline2DurationText"),
  
  TASKBASELINE3STARTTEXT("TaskBaseline3StartText"),
  
  TASKBASELINE3FINISHTEXT("TaskBaseline3FinishText"),
  
  TASKBASELINE3DURATIONTEXT("TaskBaseline3DurationText"),
  
  TASKBASELINE4STARTTEXT("TaskBaseline4StartText"),
  
  TASKBASELINE4FINISHTEXT("TaskBaseline4FinishText"),
  
  TASKBASELINE4DURATIONTEXT("TaskBaseline4DurationText"),
  
  TASKBASELINE5STARTTEXT("TaskBaseline5StartText"),
  
  TASKBASELINE5FINISHTEXT("TaskBaseline5FinishText"),
  
  TASKBASELINE5DURATIONTEXT("TaskBaseline5DurationText"),
  
  TASKBASELINE6STARTTEXT("TaskBaseline6StartText"),
  
  TASKBASELINE6FINISHTEXT("TaskBaseline6FinishText"),
  
  TASKBASELINE6DURATIONTEXT("TaskBaseline6DurationText"),
  
  TASKBASELINE7STARTTEXT("TaskBaseline7StartText"),
  
  TASKBASELINE7FINISHTEXT("TaskBaseline7FinishText"),
  
  TASKBASELINE7DURATIONTEXT("TaskBaseline7DurationText"),
  
  TASKBASELINE8STARTTEXT("TaskBaseline8StartText"),
  
  TASKBASELINE8FINISHTEXT("TaskBaseline8FinishText"),
  
  TASKBASELINE8DURATIONTEXT("TaskBaseline8DurationText"),
  
  TASKBASELINE9STARTTEXT("TaskBaseline9StartText"),
  
  TASKBASELINE9FINISHTEXT("TaskBaseline9FinishText"),
  
  TASKBASELINE9DURATIONTEXT("TaskBaseline9DurationText"),
  
  TASKBASELINE10STARTTEXT("TaskBaseline10StartText"),
  
  TASKBASELINE10FINISHTEXT("TaskBaseline10FinishText"),
  
  TASKBASELINE10DURATIONTEXT("TaskBaseline10DurationText"),
  
  TASKIGNOREWARNINGS("TaskIgnoreWarnings"),
  
  TASKASSIGNMENTPEAKUNITS("TaskAssignmentPeakUnits"),
  
  TASKSCHEDULEDSTART("TaskScheduledStart"),
  
  TASKSCHEDULEDFINISH("TaskScheduledFinish"),
  
  TASKSCHEDULEDDURATION("TaskScheduledDuration"),
  
  TASKPATHDRIVINGPREDECESSOR("TaskPathDrivingPredecessor"),
  
  TASKPATHPREDECESSOR("TaskPathPredecessor"),
  
  TASKPATHDRIVENSUCCESSOR("TaskPathDrivenSuccessor"),
  
  TASKPATHSUCCESSOR("TaskPathSuccessor"),
  
  TASKSUMMARYNAME("TaskSummaryName"),
  
  RESOURCEID("ResourceID"),
  
  RESOURCENAME("ResourceName"),
  
  RESOURCEINITIALS("ResourceInitials"),
  
  RESOURCEGROUP("ResourceGroup"),
  
  RESOURCEMAXUNITS("ResourceMaxUnits"),
  
  RESOURCEBASECALENDAR("ResourceBaseCalendar"),
  
  RESOURCESTANDARDRATE("ResourceStandardRate"),
  
  RESOURCEOVERTIMERATE("ResourceOvertimeRate"),
  
  RESOURCETEXT1("ResourceText1"),
  
  RESOURCETEXT2("ResourceText2"),
  
  RESOURCECODE("ResourceCode"),
  
  RESOURCEACTUALCOST("ResourceActualCost"),
  
  RESOURCECOST("ResourceCost"),
  
  RESOURCEWORK("ResourceWork"),
  
  RESOURCEACTUALWORK("ResourceActualWork"),
  
  RESOURCEBASELINEWORK("ResourceBaselineWork"),
  
  RESOURCEOVERTIMEWORK("ResourceOvertimeWork"),
  
  RESOURCEBASELINECOST("ResourceBaselineCost"),
  
  RESOURCECOSTPERUSE("ResourceCostPerUse"),
  
  RESOURCEACCRUEAT("ResourceAccrueAt"),
  
  RESOURCENOTES("ResourceNotes"),
  
  RESOURCEREMAININGCOST("ResourceRemainingCost"),
  
  RESOURCEREMAININGWORK("ResourceRemainingWork"),
  
  RESOURCEWORKVARIANCE("ResourceWorkVariance"),
  
  RESOURCECOSTVARIANCE("ResourceCostVariance"),
  
  RESOURCEOVERALLOCATED("ResourceOverallocated"),
  
  RESOURCEPEAKUNITS("ResourcePeakUnits"),
  
  RESOURCEUNIQUEID("ResourceUniqueID"),
  
  RESOURCESHEETNOTES("ResourceSheetNotes"),
  
  RESOURCEPERCENTWORKCOMPLETE("ResourcePercentWorkComplete"),
  
  RESOURCETEXT3("ResourceText3"),
  
  RESOURCETEXT4("ResourceText4"),
  
  RESOURCETEXT5("ResourceText5"),
  
  RESOURCEOBJECTS("ResourceObjects"),
  
  RESOURCELINKEDFIELDS("ResourceLinkedFields"),
  
  RESOURCEEMAILADDRESS("ResourceEMailAddress"),
  
  RESOURCEREGULARWORK("ResourceRegularWork"),
  
  RESOURCEACTUALOVERTIMEWORK("ResourceActualOvertimeWork"),
  
  RESOURCEREMAININGOVERTIMEWORK("ResourceRemainingOvertimeWork"),
  
  RESOURCEOVERTIMECOST("ResourceOvertimeCost"),
  
  RESOURCEACTUALOVERTIMECOST("ResourceActualOvertimeCost"),
  
  RESOURCEREMAININGOVERTIMECOST("ResourceRemainingOvertimeCost"),
  
  RESOURCEBCWS("ResourceBCWS"),
  
  RESOURCEBCWP("ResourceBCWP"),
  
  RESOURCEACWP("ResourceACWP"),
  
  RESOURCESV("ResourceSV"),
  
  RESOURCEAVAILABLEFROM("ResourceAvailableFrom"),
  
  RESOURCEAVAILABLETO("ResourceAvailableTo"),
  
  RESOURCEINDICATORS("ResourceIndicators"),
  
  RESOURCETEXT6("ResourceText6"),
  
  RESOURCETEXT7("ResourceText7"),
  
  RESOURCETEXT8("ResourceText8"),
  
  RESOURCETEXT9("ResourceText9"),
  
  RESOURCETEXT10("ResourceText10"),
  
  RESOURCESTART1("ResourceStart1"),
  
  RESOURCESTART2("ResourceStart2"),
  
  RESOURCESTART3("ResourceStart3"),
  
  RESOURCESTART4("ResourceStart4"),
  
  RESOURCESTART5("ResourceStart5"),
  
  RESOURCEFINISH1("ResourceFinish1"),
  
  RESOURCEFINISH2("ResourceFinish2"),
  
  RESOURCEFINISH3("ResourceFinish3"),
  
  RESOURCEFINISH4("ResourceFinish4"),
  
  RESOURCEFINISH5("ResourceFinish5"),
  
  RESOURCENUMBER1("ResourceNumber1"),
  
  RESOURCENUMBER2("ResourceNumber2"),
  
  RESOURCENUMBER3("ResourceNumber3"),
  
  RESOURCENUMBER4("ResourceNumber4"),
  
  RESOURCENUMBER5("ResourceNumber5"),
  
  RESOURCEDURATION1("ResourceDuration1"),
  
  RESOURCEDURATION2("ResourceDuration2"),
  
  RESOURCEDURATION3("ResourceDuration3"),
  
  RESOURCECOST1("ResourceCost1"),
  
  RESOURCECOST2("ResourceCost2"),
  
  RESOURCECOST3("ResourceCost3"),
  
  RESOURCEFLAG10("ResourceFlag10"),
  
  RESOURCEFLAG1("ResourceFlag1"),
  
  RESOURCEFLAG2("ResourceFlag2"),
  
  RESOURCEFLAG3("ResourceFlag3"),
  
  RESOURCEFLAG4("ResourceFlag4"),
  
  RESOURCEFLAG5("ResourceFlag5"),
  
  RESOURCEFLAG6("ResourceFlag6"),
  
  RESOURCEFLAG7("ResourceFlag7"),
  
  RESOURCEFLAG8("ResourceFlag8"),
  
  RESOURCEFLAG9("ResourceFlag9"),
  
  RESOURCEHYPERLINK("ResourceHyperlink"),
  
  RESOURCEHYPERLINKADDRESS("ResourceHyperlinkAddress"),
  
  RESOURCEHYPERLINKSUBADDRESS("ResourceHyperlinkSubAddress"),
  
  RESOURCEHYPERLINKHREF("ResourceHyperlinkHref"),
  
  RESOURCEISASSIGNMENT("ResourceIsAssignment"),
  
  RESOURCETASKSUMMARYNAME("ResourceTaskSummaryName"),
  
  RESOURCECANLEVEL("ResourceCanLevel"),
  
  RESOURCEWORKCONTOUR("ResourceWorkContour"),
  
  RESOURCECOST4("ResourceCost4"),
  
  RESOURCECOST5("ResourceCost5"),
  
  RESOURCECOST6("ResourceCost6"),
  
  RESOURCECOST7("ResourceCost7"),
  
  RESOURCECOST8("ResourceCost8"),
  
  RESOURCECOST9("ResourceCost9"),
  
  RESOURCECOST10("ResourceCost10"),
  
  RESOURCEDATE1("ResourceDate1"),
  
  RESOURCEDATE2("ResourceDate2"),
  
  RESOURCEDATE3("ResourceDate3"),
  
  RESOURCEDATE4("ResourceDate4"),
  
  RESOURCEDATE5("ResourceDate5"),
  
  RESOURCEDATE6("ResourceDate6"),
  
  RESOURCEDATE7("ResourceDate7"),
  
  RESOURCEDATE8("ResourceDate8"),
  
  RESOURCEDATE9("ResourceDate9"),
  
  RESOURCEDATE10("ResourceDate10"),
  
  RESOURCEDURATION4("ResourceDuration4"),
  
  RESOURCEDURATION5("ResourceDuration5"),
  
  RESOURCEDURATION6("ResourceDuration6"),
  
  RESOURCEDURATION7("ResourceDuration7"),
  
  RESOURCEDURATION8("ResourceDuration8"),
  
  RESOURCEDURATION9("ResourceDuration9"),
  
  RESOURCEDURATION10("ResourceDuration10"),
  
  RESOURCEFINISH6("ResourceFinish6"),
  
  RESOURCEFINISH7("ResourceFinish7"),
  
  RESOURCEFINISH8("ResourceFinish8"),
  
  RESOURCEFINISH9("ResourceFinish9"),
  
  RESOURCEFINISH10("ResourceFinish10"),
  
  RESOURCEFLAG11("ResourceFlag11"),
  
  RESOURCEFLAG12("ResourceFlag12"),
  
  RESOURCEFLAG13("ResourceFlag13"),
  
  RESOURCEFLAG14("ResourceFlag14"),
  
  RESOURCEFLAG15("ResourceFlag15"),
  
  RESOURCEFLAG16("ResourceFlag16"),
  
  RESOURCEFLAG17("ResourceFlag17"),
  
  RESOURCEFLAG18("ResourceFlag18"),
  
  RESOURCEFLAG19("ResourceFlag19"),
  
  RESOURCEFLAG20("ResourceFlag20"),
  
  RESOURCENUMBER6("ResourceNumber6"),
  
  RESOURCENUMBER7("ResourceNumber7"),
  
  RESOURCENUMBER8("ResourceNumber8"),
  
  RESOURCENUMBER9("ResourceNumber9"),
  
  RESOURCENUMBER10("ResourceNumber10"),
  
  RESOURCENUMBER11("ResourceNumber11"),
  
  RESOURCENUMBER12("ResourceNumber12"),
  
  RESOURCENUMBER13("ResourceNumber13"),
  
  RESOURCENUMBER14("ResourceNumber14"),
  
  RESOURCENUMBER15("ResourceNumber15"),
  
  RESOURCENUMBER16("ResourceNumber16"),
  
  RESOURCENUMBER17("ResourceNumber17"),
  
  RESOURCENUMBER18("ResourceNumber18"),
  
  RESOURCENUMBER19("ResourceNumber19"),
  
  RESOURCENUMBER20("ResourceNumber20"),
  
  RESOURCESTART6("ResourceStart6"),
  
  RESOURCESTART7("ResourceStart7"),
  
  RESOURCESTART8("ResourceStart8"),
  
  RESOURCESTART9("ResourceStart9"),
  
  RESOURCESTART10("ResourceStart10"),
  
  RESOURCETEXT11("ResourceText11"),
  
  RESOURCETEXT12("ResourceText12"),
  
  RESOURCETEXT13("ResourceText13"),
  
  RESOURCETEXT14("ResourceText14"),
  
  RESOURCETEXT15("ResourceText15"),
  
  RESOURCETEXT16("ResourceText16"),
  
  RESOURCETEXT17("ResourceText17"),
  
  RESOURCETEXT18("ResourceText18"),
  
  RESOURCETEXT19("ResourceText19"),
  
  RESOURCETEXT20("ResourceText20"),
  
  RESOURCETEXT21("ResourceText21"),
  
  RESOURCETEXT22("ResourceText22"),
  
  RESOURCETEXT23("ResourceText23"),
  
  RESOURCETEXT24("ResourceText24"),
  
  RESOURCETEXT25("ResourceText25"),
  
  RESOURCETEXT26("ResourceText26"),
  
  RESOURCETEXT27("ResourceText27"),
  
  RESOURCETEXT28("ResourceText28"),
  
  RESOURCETEXT29("ResourceText29"),
  
  RESOURCETEXT30("ResourceText30"),
  
  RESOURCEPHONETICS("ResourcePhonetics"),
  
  RESOURCEINDEX("ResourceIndex"),
  
  RESOURCEASSIGNMENTDELAY("ResourceAssignmentDelay"),
  
  RESOURCEASSIGNMENTUNITS("ResourceAssignmentUnits"),
  
  RESOURCEBASELINESTART("ResourceBaselineStart"),
  
  RESOURCEBASELINEFINISH("ResourceBaselineFinish"),
  
  RESOURCECONFIRMED("ResourceConfirmed"),
  
  RESOURCEFINISH("ResourceFinish"),
  
  RESOURCELEVELINGDELAY("ResourceLevelingDelay"),
  
  RESOURCERESPONSEPENDING("ResourceResponsePending"),
  
  RESOURCESTART("ResourceStart"),
  
  RESOURCETEAMSTATUSPENDING("ResourceTeamStatusPending"),
  
  RESOURCEUPDATENEEDED("ResourceUpdateNeeded"),
  
  RESOURCECV("ResourceCV"),
  
  RESOURCECOSTRATETABLE("ResourceCostRateTable"),
  
  RESOURCEWORKGROUP("ResourceWorkgroup"),
  
  RESOURCEPROJECT("ResourceProject"),
  
  RESOURCEOUTLINECODE1("ResourceOutlineCode1"),
  
  RESOURCEOUTLINECODE2("ResourceOutlineCode2"),
  
  RESOURCEOUTLINECODE3("ResourceOutlineCode3"),
  
  RESOURCEOUTLINECODE4("ResourceOutlineCode4"),
  
  RESOURCEOUTLINECODE5("ResourceOutlineCode5"),
  
  RESOURCEOUTLINECODE6("ResourceOutlineCode6"),
  
  RESOURCEOUTLINECODE7("ResourceOutlineCode7"),
  
  RESOURCEOUTLINECODE8("ResourceOutlineCode8"),
  
  RESOURCEOUTLINECODE9("ResourceOutlineCode9"),
  
  RESOURCEOUTLINECODE10("ResourceOutlineCode10"),
  
  RESOURCEMATERIALLABEL("ResourceMaterialLabel"),
  
  RESOURCETYPE("ResourceType"),
  
  RESOURCEVAC("ResourceVAC"),
  
  RESOURCEGROUPBYSUMMARY("ResourceGroupBySummary"),
  
  RESOURCEWINDOWSUSERACCOUNT("ResourceWindowsUserAccount"),
  
  RESOURCEHYPERLINKSCREENTIP("ResourceHyperlinkScreenTip"),
  
  RESOURCEWBS("ResourceWBS"),
  
  RESOURCEBASELINE1WORK("ResourceBaseline1Work"),
  
  RESOURCEBASELINE1COST("ResourceBaseline1Cost"),
  
  RESOURCEBASELINE1START("ResourceBaseline1Start"),
  
  RESOURCEBASELINE1FINISH("ResourceBaseline1Finish"),
  
  RESOURCEBASELINE2WORK("ResourceBaseline2Work"),
  
  RESOURCEBASELINE2COST("ResourceBaseline2Cost"),
  
  RESOURCEBASELINE2START("ResourceBaseline2Start"),
  
  RESOURCEBASELINE2FINISH("ResourceBaseline2Finish"),
  
  RESOURCEBASELINE3WORK("ResourceBaseline3Work"),
  
  RESOURCEBASELINE3COST("ResourceBaseline3Cost"),
  
  RESOURCEBASELINE3START("ResourceBaseline3Start"),
  
  RESOURCEBASELINE3FINISH("ResourceBaseline3Finish"),
  
  RESOURCEBASELINE4WORK("ResourceBaseline4Work"),
  
  RESOURCEBASELINE4COST("ResourceBaseline4Cost"),
  
  RESOURCEBASELINE4START("ResourceBaseline4Start"),
  
  RESOURCEBASELINE4FINISH("ResourceBaseline4Finish"),
  
  RESOURCEBASELINE5WORK("ResourceBaseline5Work"),
  
  RESOURCEBASELINE5COST("ResourceBaseline5Cost"),
  
  RESOURCEBASELINE5START("ResourceBaseline5Start"),
  
  RESOURCEBASELINE5FINISH("ResourceBaseline5Finish"),
  
  RESOURCEBASELINE6WORK("ResourceBaseline6Work"),
  
  RESOURCEBASELINE6COST("ResourceBaseline6Cost"),
  
  RESOURCEBASELINE6START("ResourceBaseline6Start"),
  
  RESOURCEBASELINE6FINISH("ResourceBaseline6Finish"),
  
  RESOURCEBASELINE7WORK("ResourceBaseline7Work"),
  
  RESOURCEBASELINE7COST("ResourceBaseline7Cost"),
  
  RESOURCEBASELINE7START("ResourceBaseline7Start"),
  
  RESOURCEBASELINE7FINISH("ResourceBaseline7Finish"),
  
  RESOURCEBASELINE8WORK("ResourceBaseline8Work"),
  
  RESOURCEBASELINE8COST("ResourceBaseline8Cost"),
  
  RESOURCEBASELINE8START("ResourceBaseline8Start"),
  
  RESOURCEBASELINE8FINISH("ResourceBaseline8Finish"),
  
  RESOURCEBASELINE9WORK("ResourceBaseline9Work"),
  
  RESOURCEBASELINE9COST("ResourceBaseline9Cost"),
  
  RESOURCEBASELINE9START("ResourceBaseline9Start"),
  
  RESOURCEBASELINE9FINISH("ResourceBaseline9Finish"),
  
  RESOURCEBASELINE10WORK("ResourceBaseline10Work"),
  
  RESOURCEBASELINE10COST("ResourceBaseline10Cost"),
  
  RESOURCEBASELINE10START("ResourceBaseline10Start"),
  
  RESOURCEBASELINE10FINISH("ResourceBaseline10Finish"),
  
  RESOURCEENTERPRISEUNIQUEID("ResourceEnterpriseUniqueID"),
  
  RESOURCEENTERPRISECOST1("ResourceEnterpriseCost1"),
  
  RESOURCEENTERPRISECOST2("ResourceEnterpriseCost2"),
  
  RESOURCEENTERPRISECOST3("ResourceEnterpriseCost3"),
  
  RESOURCEENTERPRISECOST4("ResourceEnterpriseCost4"),
  
  RESOURCEENTERPRISECOST5("ResourceEnterpriseCost5"),
  
  RESOURCEENTERPRISECOST6("ResourceEnterpriseCost6"),
  
  RESOURCEENTERPRISECOST7("ResourceEnterpriseCost7"),
  
  RESOURCEENTERPRISECOST8("ResourceEnterpriseCost8"),
  
  RESOURCEENTERPRISECOST9("ResourceEnterpriseCost9"),
  
  RESOURCEENTERPRISECOST10("ResourceEnterpriseCost10"),
  
  RESOURCEENTERPRISEDATE1("ResourceEnterpriseDate1"),
  
  RESOURCEENTERPRISEDATE2("ResourceEnterpriseDate2"),
  
  RESOURCEENTERPRISEDATE3("ResourceEnterpriseDate3"),
  
  RESOURCEENTERPRISEDATE4("ResourceEnterpriseDate4"),
  
  RESOURCEENTERPRISEDATE5("ResourceEnterpriseDate5"),
  
  RESOURCEENTERPRISEDATE6("ResourceEnterpriseDate6"),
  
  RESOURCEENTERPRISEDATE7("ResourceEnterpriseDate7"),
  
  RESOURCEENTERPRISEDATE8("ResourceEnterpriseDate8"),
  
  RESOURCEENTERPRISEDATE9("ResourceEnterpriseDate9"),
  
  RESOURCEENTERPRISEDATE10("ResourceEnterpriseDate10"),
  
  RESOURCEENTERPRISEDATE11("ResourceEnterpriseDate11"),
  
  RESOURCEENTERPRISEDATE12("ResourceEnterpriseDate12"),
  
  RESOURCEENTERPRISEDATE13("ResourceEnterpriseDate13"),
  
  RESOURCEENTERPRISEDATE14("ResourceEnterpriseDate14"),
  
  RESOURCEENTERPRISEDATE15("ResourceEnterpriseDate15"),
  
  RESOURCEENTERPRISEDATE16("ResourceEnterpriseDate16"),
  
  RESOURCEENTERPRISEDATE17("ResourceEnterpriseDate17"),
  
  RESOURCEENTERPRISEDATE18("ResourceEnterpriseDate18"),
  
  RESOURCEENTERPRISEDATE19("ResourceEnterpriseDate19"),
  
  RESOURCEENTERPRISEDATE20("ResourceEnterpriseDate20"),
  
  RESOURCEENTERPRISEDATE21("ResourceEnterpriseDate21"),
  
  RESOURCEENTERPRISEDATE22("ResourceEnterpriseDate22"),
  
  RESOURCEENTERPRISEDATE23("ResourceEnterpriseDate23"),
  
  RESOURCEENTERPRISEDATE24("ResourceEnterpriseDate24"),
  
  RESOURCEENTERPRISEDATE25("ResourceEnterpriseDate25"),
  
  RESOURCEENTERPRISEDATE26("ResourceEnterpriseDate26"),
  
  RESOURCEENTERPRISEDATE27("ResourceEnterpriseDate27"),
  
  RESOURCEENTERPRISEDATE28("ResourceEnterpriseDate28"),
  
  RESOURCEENTERPRISEDATE29("ResourceEnterpriseDate29"),
  
  RESOURCEENTERPRISEDATE30("ResourceEnterpriseDate30"),
  
  RESOURCEENTERPRISEDURATION1("ResourceEnterpriseDuration1"),
  
  RESOURCEENTERPRISEDURATION2("ResourceEnterpriseDuration2"),
  
  RESOURCEENTERPRISEDURATION3("ResourceEnterpriseDuration3"),
  
  RESOURCEENTERPRISEDURATION4("ResourceEnterpriseDuration4"),
  
  RESOURCEENTERPRISEDURATION5("ResourceEnterpriseDuration5"),
  
  RESOURCEENTERPRISEDURATION6("ResourceEnterpriseDuration6"),
  
  RESOURCEENTERPRISEDURATION7("ResourceEnterpriseDuration7"),
  
  RESOURCEENTERPRISEDURATION8("ResourceEnterpriseDuration8"),
  
  RESOURCEENTERPRISEDURATION9("ResourceEnterpriseDuration9"),
  
  RESOURCEENTERPRISEDURATION10("ResourceEnterpriseDuration10"),
  
  RESOURCEENTERPRISEFLAG1("ResourceEnterpriseFlag1"),
  
  RESOURCEENTERPRISEFLAG2("ResourceEnterpriseFlag2"),
  
  RESOURCEENTERPRISEFLAG3("ResourceEnterpriseFlag3"),
  
  RESOURCEENTERPRISEFLAG4("ResourceEnterpriseFlag4"),
  
  RESOURCEENTERPRISEFLAG5("ResourceEnterpriseFlag5"),
  
  RESOURCEENTERPRISEFLAG6("ResourceEnterpriseFlag6"),
  
  RESOURCEENTERPRISEFLAG7("ResourceEnterpriseFlag7"),
  
  RESOURCEENTERPRISEFLAG8("ResourceEnterpriseFlag8"),
  
  RESOURCEENTERPRISEFLAG9("ResourceEnterpriseFlag9"),
  
  RESOURCEENTERPRISEFLAG10("ResourceEnterpriseFlag10"),
  
  RESOURCEENTERPRISEFLAG11("ResourceEnterpriseFlag11"),
  
  RESOURCEENTERPRISEFLAG12("ResourceEnterpriseFlag12"),
  
  RESOURCEENTERPRISEFLAG13("ResourceEnterpriseFlag13"),
  
  RESOURCEENTERPRISEFLAG14("ResourceEnterpriseFlag14"),
  
  RESOURCEENTERPRISEFLAG15("ResourceEnterpriseFlag15"),
  
  RESOURCEENTERPRISEFLAG16("ResourceEnterpriseFlag16"),
  
  RESOURCEENTERPRISEFLAG17("ResourceEnterpriseFlag17"),
  
  RESOURCEENTERPRISEFLAG18("ResourceEnterpriseFlag18"),
  
  RESOURCEENTERPRISEFLAG19("ResourceEnterpriseFlag19"),
  
  RESOURCEENTERPRISEFLAG20("ResourceEnterpriseFlag20"),
  
  RESOURCEENTERPRISENUMBER1("ResourceEnterpriseNumber1"),
  
  RESOURCEENTERPRISENUMBER2("ResourceEnterpriseNumber2"),
  
  RESOURCEENTERPRISENUMBER3("ResourceEnterpriseNumber3"),
  
  RESOURCEENTERPRISENUMBER4("ResourceEnterpriseNumber4"),
  
  RESOURCEENTERPRISENUMBER5("ResourceEnterpriseNumber5"),
  
  RESOURCEENTERPRISENUMBER6("ResourceEnterpriseNumber6"),
  
  RESOURCEENTERPRISENUMBER7("ResourceEnterpriseNumber7"),
  
  RESOURCEENTERPRISENUMBER8("ResourceEnterpriseNumber8"),
  
  RESOURCEENTERPRISENUMBER9("ResourceEnterpriseNumber9"),
  
  RESOURCEENTERPRISENUMBER10("ResourceEnterpriseNumber10"),
  
  RESOURCEENTERPRISENUMBER11("ResourceEnterpriseNumber11"),
  
  RESOURCEENTERPRISENUMBER12("ResourceEnterpriseNumber12"),
  
  RESOURCEENTERPRISENUMBER13("ResourceEnterpriseNumber13"),
  
  RESOURCEENTERPRISENUMBER14("ResourceEnterpriseNumber14"),
  
  RESOURCEENTERPRISENUMBER15("ResourceEnterpriseNumber15"),
  
  RESOURCEENTERPRISENUMBER16("ResourceEnterpriseNumber16"),
  
  RESOURCEENTERPRISENUMBER17("ResourceEnterpriseNumber17"),
  
  RESOURCEENTERPRISENUMBER18("ResourceEnterpriseNumber18"),
  
  RESOURCEENTERPRISENUMBER19("ResourceEnterpriseNumber19"),
  
  RESOURCEENTERPRISENUMBER20("ResourceEnterpriseNumber20"),
  
  RESOURCEENTERPRISENUMBER21("ResourceEnterpriseNumber21"),
  
  RESOURCEENTERPRISENUMBER22("ResourceEnterpriseNumber22"),
  
  RESOURCEENTERPRISENUMBER23("ResourceEnterpriseNumber23"),
  
  RESOURCEENTERPRISENUMBER24("ResourceEnterpriseNumber24"),
  
  RESOURCEENTERPRISENUMBER25("ResourceEnterpriseNumber25"),
  
  RESOURCEENTERPRISENUMBER26("ResourceEnterpriseNumber26"),
  
  RESOURCEENTERPRISENUMBER27("ResourceEnterpriseNumber27"),
  
  RESOURCEENTERPRISENUMBER28("ResourceEnterpriseNumber28"),
  
  RESOURCEENTERPRISENUMBER29("ResourceEnterpriseNumber29"),
  
  RESOURCEENTERPRISENUMBER30("ResourceEnterpriseNumber30"),
  
  RESOURCEENTERPRISENUMBER31("ResourceEnterpriseNumber31"),
  
  RESOURCEENTERPRISENUMBER32("ResourceEnterpriseNumber32"),
  
  RESOURCEENTERPRISENUMBER33("ResourceEnterpriseNumber33"),
  
  RESOURCEENTERPRISENUMBER34("ResourceEnterpriseNumber34"),
  
  RESOURCEENTERPRISENUMBER35("ResourceEnterpriseNumber35"),
  
  RESOURCEENTERPRISENUMBER36("ResourceEnterpriseNumber36"),
  
  RESOURCEENTERPRISENUMBER37("ResourceEnterpriseNumber37"),
  
  RESOURCEENTERPRISENUMBER38("ResourceEnterpriseNumber38"),
  
  RESOURCEENTERPRISENUMBER39("ResourceEnterpriseNumber39"),
  
  RESOURCEENTERPRISENUMBER40("ResourceEnterpriseNumber40"),
  
  RESOURCEENTERPRISEOUTLINECODE1("ResourceEnterpriseOutlineCode1"),
  
  RESOURCEENTERPRISEOUTLINECODE2("ResourceEnterpriseOutlineCode2"),
  
  RESOURCEENTERPRISEOUTLINECODE3("ResourceEnterpriseOutlineCode3"),
  
  RESOURCEENTERPRISEOUTLINECODE4("ResourceEnterpriseOutlineCode4"),
  
  RESOURCEENTERPRISEOUTLINECODE5("ResourceEnterpriseOutlineCode5"),
  
  RESOURCEENTERPRISEOUTLINECODE6("ResourceEnterpriseOutlineCode6"),
  
  RESOURCEENTERPRISEOUTLINECODE7("ResourceEnterpriseOutlineCode7"),
  
  RESOURCEENTERPRISEOUTLINECODE8("ResourceEnterpriseOutlineCode8"),
  
  RESOURCEENTERPRISEOUTLINECODE9("ResourceEnterpriseOutlineCode9"),
  
  RESOURCEENTERPRISEOUTLINECODE10("ResourceEnterpriseOutlineCode10"),
  
  RESOURCEENTERPRISEOUTLINECODE11("ResourceEnterpriseOutlineCode11"),
  
  RESOURCEENTERPRISEOUTLINECODE12("ResourceEnterpriseOutlineCode12"),
  
  RESOURCEENTERPRISEOUTLINECODE13("ResourceEnterpriseOutlineCode13"),
  
  RESOURCEENTERPRISEOUTLINECODE14("ResourceEnterpriseOutlineCode14"),
  
  RESOURCEENTERPRISEOUTLINECODE15("ResourceEnterpriseOutlineCode15"),
  
  RESOURCEENTERPRISEOUTLINECODE16("ResourceEnterpriseOutlineCode16"),
  
  RESOURCEENTERPRISEOUTLINECODE17("ResourceEnterpriseOutlineCode17"),
  
  RESOURCEENTERPRISEOUTLINECODE18("ResourceEnterpriseOutlineCode18"),
  
  RESOURCEENTERPRISEOUTLINECODE19("ResourceEnterpriseOutlineCode19"),
  
  RESOURCEENTERPRISEOUTLINECODE20("ResourceEnterpriseOutlineCode20"),
  
  RESOURCEENTERPRISEOUTLINECODE21("ResourceEnterpriseOutlineCode21"),
  
  RESOURCEENTERPRISEOUTLINECODE22("ResourceEnterpriseOutlineCode22"),
  
  RESOURCEENTERPRISEOUTLINECODE23("ResourceEnterpriseOutlineCode23"),
  
  RESOURCEENTERPRISEOUTLINECODE24("ResourceEnterpriseOutlineCode24"),
  
  RESOURCEENTERPRISEOUTLINECODE25("ResourceEnterpriseOutlineCode25"),
  
  RESOURCEENTERPRISEOUTLINECODE26("ResourceEnterpriseOutlineCode26"),
  
  RESOURCEENTERPRISEOUTLINECODE27("ResourceEnterpriseOutlineCode27"),
  
  RESOURCEENTERPRISEOUTLINECODE28("ResourceEnterpriseOutlineCode28"),
  
  RESOURCEENTERPRISEOUTLINECODE29("ResourceEnterpriseOutlineCode29"),
  
  RESOURCEENTERPRISERBS("ResourceEnterpriseRBS"),
  
  RESOURCEENTERPRISETEXT1("ResourceEnterpriseText1"),
  
  RESOURCEENTERPRISETEXT2("ResourceEnterpriseText2"),
  
  RESOURCEENTERPRISETEXT3("ResourceEnterpriseText3"),
  
  RESOURCEENTERPRISETEXT4("ResourceEnterpriseText4"),
  
  RESOURCEENTERPRISETEXT5("ResourceEnterpriseText5"),
  
  RESOURCEENTERPRISETEXT6("ResourceEnterpriseText6"),
  
  RESOURCEENTERPRISETEXT7("ResourceEnterpriseText7"),
  
  RESOURCEENTERPRISETEXT8("ResourceEnterpriseText8"),
  
  RESOURCEENTERPRISETEXT9("ResourceEnterpriseText9"),
  
  RESOURCEENTERPRISETEXT10("ResourceEnterpriseText10"),
  
  RESOURCEENTERPRISETEXT11("ResourceEnterpriseText11"),
  
  RESOURCEENTERPRISETEXT12("ResourceEnterpriseText12"),
  
  RESOURCEENTERPRISETEXT13("ResourceEnterpriseText13"),
  
  RESOURCEENTERPRISETEXT14("ResourceEnterpriseText14"),
  
  RESOURCEENTERPRISETEXT15("ResourceEnterpriseText15"),
  
  RESOURCEENTERPRISETEXT16("ResourceEnterpriseText16"),
  
  RESOURCEENTERPRISETEXT17("ResourceEnterpriseText17"),
  
  RESOURCEENTERPRISETEXT18("ResourceEnterpriseText18"),
  
  RESOURCEENTERPRISETEXT19("ResourceEnterpriseText19"),
  
  RESOURCEENTERPRISETEXT20("ResourceEnterpriseText20"),
  
  RESOURCEENTERPRISETEXT21("ResourceEnterpriseText21"),
  
  RESOURCEENTERPRISETEXT22("ResourceEnterpriseText22"),
  
  RESOURCEENTERPRISETEXT23("ResourceEnterpriseText23"),
  
  RESOURCEENTERPRISETEXT24("ResourceEnterpriseText24"),
  
  RESOURCEENTERPRISETEXT25("ResourceEnterpriseText25"),
  
  RESOURCEENTERPRISETEXT26("ResourceEnterpriseText26"),
  
  RESOURCEENTERPRISETEXT27("ResourceEnterpriseText27"),
  
  RESOURCEENTERPRISETEXT28("ResourceEnterpriseText28"),
  
  RESOURCEENTERPRISETEXT29("ResourceEnterpriseText29"),
  
  RESOURCEENTERPRISETEXT30("ResourceEnterpriseText30"),
  
  RESOURCEENTERPRISETEXT31("ResourceEnterpriseText31"),
  
  RESOURCEENTERPRISETEXT32("ResourceEnterpriseText32"),
  
  RESOURCEENTERPRISETEXT33("ResourceEnterpriseText33"),
  
  RESOURCEENTERPRISETEXT34("ResourceEnterpriseText34"),
  
  RESOURCEENTERPRISETEXT35("ResourceEnterpriseText35"),
  
  RESOURCEENTERPRISETEXT36("ResourceEnterpriseText36"),
  
  RESOURCEENTERPRISETEXT37("ResourceEnterpriseText37"),
  
  RESOURCEENTERPRISETEXT38("ResourceEnterpriseText38"),
  
  RESOURCEENTERPRISETEXT39("ResourceEnterpriseText39"),
  
  RESOURCEENTERPRISETEXT40("ResourceEnterpriseText40"),
  
  RESOURCEENTERPRISEGENERIC("ResourceEnterpriseGeneric"),
  
  RESOURCEENTERPRISEBASECALENDAR("ResourceEnterpriseBaseCalendar"),
  
  RESOURCEENTERPRISEREQUIREDVALUES("ResourceEnterpriseRequiredValues"),
  
  RESOURCEENTERPRISENAMEUSED("ResourceEnterpriseNameUsed"),
  
  RESOURCEDEMANDEDREQUESTED("ResourceDemandedRequested"),
  
  RESOURCEENTERPRISE("ResourceEnterprise"),
  
  RESOURCEENTERPRISEISCHECKEDOUT("ResourceEnterpriseIsCheckedOut"),
  
  RESOURCEENTERPRISECHECKEDOUTBY("ResourceEnterpriseCheckedOutBy"),
  
  RESOURCEENTERPRISELASTMODIFIEDDATE("ResourceEnterpriseLastModifiedDate"),
  
  RESOURCEENTERPRISETEAMMEMBER("ResourceEnterpriseTeamMember"),
  
  RESOURCEENTERPRISEINACTIVE("ResourceEnterpriseInactive"),
  
  RESOURCEBOOKINGTYPE("ResourceBookingType"),
  
  RESOURCEENTERPRISEMULTIVALUE20("ResourceEnterpriseMultiValue20"),
  
  RESOURCEENTERPRISEMULTIVALUE21("ResourceEnterpriseMultiValue21"),
  
  RESOURCEENTERPRISEMULTIVALUE22("ResourceEnterpriseMultiValue22"),
  
  RESOURCEENTERPRISEMULTIVALUE23("ResourceEnterpriseMultiValue23"),
  
  RESOURCEENTERPRISEMULTIVALUE24("ResourceEnterpriseMultiValue24"),
  
  RESOURCEENTERPRISEMULTIVALUE25("ResourceEnterpriseMultiValue25"),
  
  RESOURCEENTERPRISEMULTIVALUE26("ResourceEnterpriseMultiValue26"),
  
  RESOURCEENTERPRISEMULTIVALUE27("ResourceEnterpriseMultiValue27"),
  
  RESOURCEENTERPRISEMULTIVALUE28("ResourceEnterpriseMultiValue28"),
  
  RESOURCEENTERPRISEMULTIVALUE29("ResourceEnterpriseMultiValue29"),
  
  RESOURCEACTUALWORKPROTECTED("ResourceActualWorkProtected"),
  
  RESOURCEACTUALOVERTIMEWORKPROTECTED("ResourceActualOvertimeWorkProtected"),
  
  RESOURCECREATED("ResourceCreated"),
  
  RESOURCEGUID("ResourceGuid"),
  
  RESOURCECALENDARGUID("ResourceCalendarGuid"),
  
  RESOURCETYPEISCOST("ResourceTypeIsCost"),
  
  RESOURCEERRORMESSAGE("ResourceErrorMessage"),
  
  RESOURCEDEFAULTASSIGNMENTOWNER("ResourceDefaultAssignmentOwner"),
  
  RESOURCEBUDGET("ResourceBudget"),
  
  RESOURCEBUDGETWORK("ResourceBudgetWork"),
  
  RESOURCEBUDGETCOST("ResourceBudgetCost"),
  
  IMPORTRESOURCE("ImportResource"),
  
  RESOURCEBASELINEBUDGETWORK("ResourceBaselineBudgetWork"),
  
  RESOURCEBASELINEBUDGETCOST("ResourceBaselineBudgetCost"),
  
  RESOURCEBASELINE1BUDGETWORK("ResourceBaseline1BudgetWork"),
  
  RESOURCEBASELINE1BUDGETCOST("ResourceBaseline1BudgetCost"),
  
  RESOURCEBASELINE2BUDGETWORK("ResourceBaseline2BudgetWork"),
  
  RESOURCEBASELINE2BUDGETCOST("ResourceBaseline2BudgetCost"),
  
  RESOURCEBASELINE3BUDGETWORK("ResourceBaseline3BudgetWork"),
  
  RESOURCEBASELINE3BUDGETCOST("ResourceBaseline3BudgetCost"),
  
  RESOURCEBASELINE4BUDGETWORK("ResourceBaseline4BudgetWork"),
  
  RESOURCEBASELINE4BUDGETCOST("ResourceBaseline4BudgetCost"),
  
  RESOURCEBASELINE5BUDGETWORK("ResourceBaseline5BudgetWork"),
  
  RESOURCEBASELINE5BUDGETCOST("ResourceBaseline5BudgetCost"),
  
  RESOURCEBASELINE6BUDGETWORK("ResourceBaseline6BudgetWork"),
  
  RESOURCEBASELINE6BUDGETCOST("ResourceBaseline6BudgetCost"),
  
  RESOURCEBASELINE7BUDGETWORK("ResourceBaseline7BudgetWork"),
  
  RESOURCEBASELINE7BUDGETCOST("ResourceBaseline7BudgetCost"),
  
  RESOURCEBASELINE8BUDGETWORK("ResourceBaseline8BudgetWork"),
  
  RESOURCEBASELINE8BUDGETCOST("ResourceBaseline8BudgetCost"),
  
  RESOURCEBASELINE9BUDGETWORK("ResourceBaseline9BudgetWork"),
  
  RESOURCEBASELINE9BUDGETCOST("ResourceBaseline9BudgetCost"),
  
  RESOURCEBASELINE10BUDGETWORK("ResourceBaseline10BudgetWork"),
  
  RESOURCEBASELINE10BUDGETCOST("ResourceBaseline10BudgetCost"),
  
  RESOURCEISTEAM("ResourceIsTeam"),
  
  RESOURCECOSTCENTER("ResourceCostCenter"),
  
  RESOURCEASSIGNMENTBASELINEWORK("ResourceAssignmentBaseLineWork"),
  
  RESOURCEASSIGNMENTBASELINECOST("ResourceAssignmentBaseLineCost"),
  
  RESOURCEASSIGNMENTBASELINESTART("ResourceAssignmentBaseLineStart"),
  
  RESOURCEASSIGNMENTBASELINEFINISH("ResourceAssignmentBaseLineFinish"),
  
  RESOURCEASSIGNMENTBASELINECOSTPERUSE("ResourceAssignmentBaseLineCostPerUse"),
  
  RESOURCEASSIGNMENTGUID("ResourceAssignmentGuid");

  private String value;

  Field(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Field fromValue(String text) {
    for (Field b : Field.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<Field> {
    @Override
    public void write(final JsonWriter jsonWriter, final Field enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Field read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Field.fromValue(String.valueOf(value));
    }
  }
}


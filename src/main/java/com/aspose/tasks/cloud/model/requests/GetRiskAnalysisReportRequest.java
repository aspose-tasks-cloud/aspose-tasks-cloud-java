/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="GetRiskAnalysisReportRequest.java">
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
 * --------------------------------------------------------------------------------------
 */
package com.aspose.tasks.cloud.model.requests;
import com.aspose.tasks.cloud.model.*;
import java.time.OffsetDateTime;
import java.math.BigDecimal;
import java.io.File;
import java.util.List;

/*
 * Request model for getRiskAnalysisReport operation.
 */
public class GetRiskAnalysisReportRequest {

    /*
     * The name of the file.
     */
    private String name;

    /*
     * The uid of the task for which this risk will be applied in Monte Carlo simulation.
     */
    private Integer taskUid;

    /*
     * Gets or sets the probability distribution used in Monte Carlo simulation. The default value is ProbabilityDistributionType.Normal.
     */
    private String distributionType;

    /*
     * The percentage of the most likely task duration which can happen in the best possible project scenario. The default value is 75, which means that if the estimated specified task duration is 4 days then the optimistic duration will be 3 days.
     */
    private Integer optimistic;

    /*
     * The percentage of the most likely task duration which can happen in the worst possible project scenario. The default value is 125, which means that if the estimated specified task duration is 4 days then the pessimistic duration will be 5 days.
     */
    private Integer pessimistic;

    /*
     * Gets or sets the confidence level that correspond to the percentage of the time the actual generated values will be within optimistic and pessimistic estimates. The default value is CL99.
     */
    private String confidenceLevel;

    /*
     * The number of iterations to use in Monte Carlo simulation. The default value is 100.
     */
    private Integer iterations;

    /*
     * The document storage.
     */
    private String storage;

    /*
     * The folder storage.
     */
    private String folder;

    /*
     * The resulting report fileName.
     */
    private String fileName;
    
    /*
     * Initializes a new instance of the GetRiskAnalysisReportRequest class.
     *  
     * @param String name The name of the file.
     * @param Integer taskUid The uid of the task for which this risk will be applied in Monte Carlo simulation.
     * @param String distributionType Gets or sets the probability distribution used in Monte Carlo simulation. The default value is ProbabilityDistributionType.Normal.
     * @param Integer optimistic The percentage of the most likely task duration which can happen in the best possible project scenario. The default value is 75, which means that if the estimated specified task duration is 4 days then the optimistic duration will be 3 days.
     * @param Integer pessimistic The percentage of the most likely task duration which can happen in the worst possible project scenario. The default value is 125, which means that if the estimated specified task duration is 4 days then the pessimistic duration will be 5 days.
     * @param String confidenceLevel Gets or sets the confidence level that correspond to the percentage of the time the actual generated values will be within optimistic and pessimistic estimates. The default value is CL99.
     * @param Integer iterations The number of iterations to use in Monte Carlo simulation. The default value is 100.
     * @param String storage The document storage.
     * @param String folder The folder storage.
     * @param String fileName The resulting report fileName.
     */
    public GetRiskAnalysisReportRequest(String name,  Integer taskUid,  String distributionType,  Integer optimistic,  Integer pessimistic,  String confidenceLevel,  Integer iterations,  String storage,  String folder,  String fileName) {
        this.name = name;
        this.taskUid = taskUid;
        this.distributionType = distributionType;
        this.optimistic = optimistic;
        this.pessimistic = pessimistic;
        this.confidenceLevel = confidenceLevel;
        this.iterations = iterations;
        this.storage = storage;
        this.folder = folder;
        this.fileName = fileName;
    }

    /*
     *  Gets The name of the file.
     */
    public String getname() {
        return name;
    }

    /*
     * Sets The name of the file.
     */
    public void setname(String value) {
        name = value;
    }

    /*
     *  Gets The uid of the task for which this risk will be applied in Monte Carlo simulation.
     */
    public Integer gettaskUid() {
        return taskUid;
    }

    /*
     * Sets The uid of the task for which this risk will be applied in Monte Carlo simulation.
     */
    public void settaskUid(Integer value) {
        taskUid = value;
    }

    /*
     *  Gets Gets or sets the probability distribution used in Monte Carlo simulation. The default value is ProbabilityDistributionType.Normal.
     */
    public String getdistributionType() {
        return distributionType;
    }

    /*
     * Sets Gets or sets the probability distribution used in Monte Carlo simulation. The default value is ProbabilityDistributionType.Normal.
     */
    public void setdistributionType(String value) {
        distributionType = value;
    }

    /*
     *  Gets The percentage of the most likely task duration which can happen in the best possible project scenario. The default value is 75, which means that if the estimated specified task duration is 4 days then the optimistic duration will be 3 days.
     */
    public Integer getoptimistic() {
        return optimistic;
    }

    /*
     * Sets The percentage of the most likely task duration which can happen in the best possible project scenario. The default value is 75, which means that if the estimated specified task duration is 4 days then the optimistic duration will be 3 days.
     */
    public void setoptimistic(Integer value) {
        optimistic = value;
    }

    /*
     *  Gets The percentage of the most likely task duration which can happen in the worst possible project scenario. The default value is 125, which means that if the estimated specified task duration is 4 days then the pessimistic duration will be 5 days.
     */
    public Integer getpessimistic() {
        return pessimistic;
    }

    /*
     * Sets The percentage of the most likely task duration which can happen in the worst possible project scenario. The default value is 125, which means that if the estimated specified task duration is 4 days then the pessimistic duration will be 5 days.
     */
    public void setpessimistic(Integer value) {
        pessimistic = value;
    }

    /*
     *  Gets Gets or sets the confidence level that correspond to the percentage of the time the actual generated values will be within optimistic and pessimistic estimates. The default value is CL99.
     */
    public String getconfidenceLevel() {
        return confidenceLevel;
    }

    /*
     * Sets Gets or sets the confidence level that correspond to the percentage of the time the actual generated values will be within optimistic and pessimistic estimates. The default value is CL99.
     */
    public void setconfidenceLevel(String value) {
        confidenceLevel = value;
    }

    /*
     *  Gets The number of iterations to use in Monte Carlo simulation. The default value is 100.
     */
    public Integer getiterations() {
        return iterations;
    }

    /*
     * Sets The number of iterations to use in Monte Carlo simulation. The default value is 100.
     */
    public void setiterations(Integer value) {
        iterations = value;
    }

    /*
     *  Gets The document storage.
     */
    public String getstorage() {
        return storage;
    }

    /*
     * Sets The document storage.
     */
    public void setstorage(String value) {
        storage = value;
    }

    /*
     *  Gets The folder storage.
     */
    public String getfolder() {
        return folder;
    }

    /*
     * Sets The folder storage.
     */
    public void setfolder(String value) {
        folder = value;
    }

    /*
     *  Gets The resulting report fileName.
     */
    public String getfileName() {
        return fileName;
    }

    /*
     * Sets The resulting report fileName.
     */
    public void setfileName(String value) {
        fileName = value;
    }
}

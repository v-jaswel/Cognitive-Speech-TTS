/*
 * Speech Services API v3.0-beta1
 * Speech Services API v3.0-beta1.
 *
 * OpenAPI spec version: v3.0-beta1
 * Contact: crservice@microsoft.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.DatasetIdentity;
import io.swagger.client.model.ModelIdentity;
import io.swagger.client.model.ProjectIdentity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TestDefinitionV30
 */
public class TestDefinitionV30 {
  @SerializedName("project")
  private ProjectIdentity project = null;

  @SerializedName("datasets")
  private List<DatasetIdentity> datasets = new ArrayList<DatasetIdentity>();

  @SerializedName("referenceModel")
  private ModelIdentity referenceModel = null;

  @SerializedName("testModel")
  private ModelIdentity testModel = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("properties")
  private Map<String, String> properties = null;

  public TestDefinitionV30 project(ProjectIdentity project) {
    this.project = project;
    return this;
  }

   /**
   * The project, the dataset is associated with
   * @return project
  **/
  @ApiModelProperty(value = "The project, the dataset is associated with")
  public ProjectIdentity getProject() {
    return project;
  }

  public void setProject(ProjectIdentity project) {
    this.project = project;
  }

  public TestDefinitionV30 datasets(List<DatasetIdentity> datasets) {
    this.datasets = datasets;
    return this;
  }

  public TestDefinitionV30 addDatasetsItem(DatasetIdentity datasetsItem) {
    this.datasets.add(datasetsItem);
    return this;
  }

   /**
   * Information about the dataset used in the test
   * @return datasets
  **/
  @ApiModelProperty(required = true, value = "Information about the dataset used in the test")
  public List<DatasetIdentity> getDatasets() {
    return datasets;
  }

  public void setDatasets(List<DatasetIdentity> datasets) {
    this.datasets = datasets;
  }

  public TestDefinitionV30 referenceModel(ModelIdentity referenceModel) {
    this.referenceModel = referenceModel;
    return this;
  }

   /**
   * The reference model that can be used to evaluate the improvements and differences
   * @return referenceModel
  **/
  @ApiModelProperty(required = true, value = "The reference model that can be used to evaluate the improvements and differences")
  public ModelIdentity getReferenceModel() {
    return referenceModel;
  }

  public void setReferenceModel(ModelIdentity referenceModel) {
    this.referenceModel = referenceModel;
  }

  public TestDefinitionV30 testModel(ModelIdentity testModel) {
    this.testModel = testModel;
    return this;
  }

   /**
   * The model that is compared to the reference model
   * @return testModel
  **/
  @ApiModelProperty(required = true, value = "The model that is compared to the reference model")
  public ModelIdentity getTestModel() {
    return testModel;
  }

  public void setTestModel(ModelIdentity testModel) {
    this.testModel = testModel;
  }

  public TestDefinitionV30 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the object
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the object")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TestDefinitionV30 description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the object
   * @return description
  **/
  @ApiModelProperty(value = "The description of the object")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TestDefinitionV30 properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public TestDefinitionV30 putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, String>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * The custom properties of this entity
   * @return properties
  **/
  @ApiModelProperty(value = "The custom properties of this entity")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestDefinitionV30 testDefinitionV30 = (TestDefinitionV30) o;
    return Objects.equals(this.project, testDefinitionV30.project) &&
        Objects.equals(this.datasets, testDefinitionV30.datasets) &&
        Objects.equals(this.referenceModel, testDefinitionV30.referenceModel) &&
        Objects.equals(this.testModel, testDefinitionV30.testModel) &&
        Objects.equals(this.name, testDefinitionV30.name) &&
        Objects.equals(this.description, testDefinitionV30.description) &&
        Objects.equals(this.properties, testDefinitionV30.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, datasets, referenceModel, testModel, name, description, properties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestDefinitionV30 {\n");
    
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    datasets: ").append(toIndentedString(datasets)).append("\n");
    sb.append("    referenceModel: ").append(toIndentedString(referenceModel)).append("\n");
    sb.append("    testModel: ").append(toIndentedString(testModel)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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


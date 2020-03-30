package ogj.demo.Entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ogj
 * @since 2020-03-28
 */
@TableName("Student_Data")
public class StudentData extends Model<StudentData> {

    private static final long serialVersionUID = 1L;

    @TableId("student_id")
    private Integer studentId;

    @TableField("college_id")
    private String collegeId;

    @TableField("major_id")
    private String majorId;

    @TableField("student_number")
    private String studentNumber;

    @TableField("student_name")
    private String studentName;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @TableField("student_birthday")
    private Date studentBirthday;

    @TableField("student_sex")
    private String studentSex;

    @TableField("student_address")
    private String studentAddress;

    @TableField("student_Political_affiliation")
    private String studentPoliticalAffiliation;

    @TableField("student_nation")
    private String studentNation;

    @TableField("student_level")
    private String studentLevel;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @TableField("student_star_time")
    private Date studentStarTime;

    @TableField("student_telphone")
    private String studentTelphone;

    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId;
    }
    public String getMajorId() {
        return majorId;
    }

    public void setMajorId(String majorId) {
        this.majorId = majorId;
    }
    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public Date getStudentBirthday() {
        return studentBirthday;
    }

    public void setStudentBirthday(Date studentBirthday) {
        this.studentBirthday = studentBirthday;
    }
    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }
    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }
    public String getStudentPoliticalAffiliation() {
        return studentPoliticalAffiliation;
    }

    public void setStudentPoliticalAffiliation(String studentPoliticalAffiliation) {
        this.studentPoliticalAffiliation = studentPoliticalAffiliation;
    }
    public String getStudentNation() {
        return studentNation;
    }

    public void setStudentNation(String studentNation) {
        this.studentNation = studentNation;
    }
    public String getStudentLevel() {
        return studentLevel;
    }

    public void setStudentLevel(String studentLevel) {
        this.studentLevel = studentLevel;
    }
    public Date getStudentStarTime() {
        return studentStarTime;
    }

    public void setStudentStarTime(Date studentStarTime) {
        this.studentStarTime = studentStarTime;
    }
    public String getStudentTelphone() {
        return studentTelphone;
    }

    public void setStudentTelphone(String studentTelphone) {
        this.studentTelphone = studentTelphone;
    }

    @Override
    protected Serializable pkVal() {
        return this.collegeId;
    }

    @Override
    public String toString() {
        return "StudentData{" +
        "collegeId=" + collegeId +
        ", majorId=" + majorId +
        ", studentId=" + studentId +
        ", studentNumber=" + studentNumber +
        ", studentName=" + studentName +
        ", studentBirthday=" + studentBirthday +
        ", studentSex=" + studentSex +
        ", studentAddress=" + studentAddress +
        ", studentPoliticalAffiliation=" + studentPoliticalAffiliation +
        ", studentNation=" + studentNation +
        ", studentLevel=" + studentLevel +
        ", studentStarTime=" + studentStarTime +
        ", studentTelphone=" + studentTelphone +
        "}";
    }
}

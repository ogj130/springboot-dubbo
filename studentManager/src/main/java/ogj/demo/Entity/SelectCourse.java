package ogj.demo.Entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ogj
 * @since 2020-03-28
 */
@TableName("Select_Course")
public class SelectCourse extends Model<SelectCourse> {

    private static final long serialVersionUID = 1L;

    @TableId("college_id")
    private String collegeId;

    @TableId("major_id")
    private String majorId;

    @TableId("student_id")
    private Integer studentId;

    @TableId("Course_Id")
    private String courseId;

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
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Override
    protected Serializable pkVal() {
        return this.collegeId;
    }

    @Override
    public String toString() {
        return "SelectCourse{" +
        "collegeId=" + collegeId +
        ", majorId=" + majorId +
        ", studentId=" + studentId +
        ", courseId=" + courseId +
        "}";
    }
}

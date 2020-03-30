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
@TableName("Teacher_Course")
public class TeacherCourse extends Model<TeacherCourse> {

    private static final long serialVersionUID = 1L;

    @TableId("college_id")
    private String collegeId;

    @TableId("major_id")
    private String majorId;

    @TableId("teacher_id")
    private String teacherId;

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
    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
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
        return "TeacherCourse{" +
        "collegeId=" + collegeId +
        ", majorId=" + majorId +
        ", teacherId=" + teacherId +
        ", courseId=" + courseId +
        "}";
    }
}

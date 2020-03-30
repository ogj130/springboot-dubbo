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
@TableName("Curriculum_Data")
public class CurriculumData extends Model<CurriculumData> {

    private static final long serialVersionUID = 1L;

    @TableId("Course_Id")
    private String courseId;

    @TableField("Course_name")
    private String courseName;

    @TableField("Course_type")
    private String courseType;

    @TableField("Course_time")
    private String courseTime;

    @TableField("Course_credit")
    private Float courseCredit;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }
    public String getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime;
    }
    public Float getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(Float courseCredit) {
        this.courseCredit = courseCredit;
    }

    @Override
    protected Serializable pkVal() {
        return this.courseId;
    }

    @Override
    public String toString() {
        return "CurriculumData{" +
        "courseId=" + courseId +
        ", courseName=" + courseName +
        ", courseType=" + courseType +
        ", courseTime=" + courseTime +
        ", courseCredit=" + courseCredit +
        "}";
    }
}

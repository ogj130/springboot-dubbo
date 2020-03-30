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
@TableName("Teacher_Data")
public class TeacherData extends Model<TeacherData> {

    private static final long serialVersionUID = 1L;

    @TableId("teacher_id")
    private String teacherId;

    @TableField("college_id")
    private String collegeId;

    @TableField("major_id")
    private String majorId;

    @TableField("teacher_name")
    private String teacherName;

    private String sex;

    private String telphone;

    private String education;

    private String address;

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
    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }
    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    protected Serializable pkVal() {
        return this.collegeId;
    }

    @Override
    public String toString() {
        return "TeacherData{" +
        "collegeId=" + collegeId +
        ", majorId=" + majorId +
        ", teacherId=" + teacherId +
        ", teacherName=" + teacherName +
        ", sex=" + sex +
        ", telphone=" + telphone +
        ", education=" + education +
        ", address=" + address +
        "}";
    }
}

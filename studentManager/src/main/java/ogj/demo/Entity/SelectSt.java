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
@TableName("Select_St")
public class SelectSt extends Model<SelectSt> {

    private static final long serialVersionUID = 1L;

    @TableId("corporation_id")
    private String corporationId;

    @TableField("college_id")
    private String collegeId;

    @TableField("major_id")
    private String majorId;

    @TableField("student_id")
    private Integer studentId;

    public String getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(String corporationId) {
        this.corporationId = corporationId;
    }
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

    @Override
    protected Serializable pkVal() {
        return this.corporationId;
    }

    @Override
    public String toString() {
        return "SelectSt{" +
        "corporationId=" + corporationId +
        ", collegeId=" + collegeId +
        ", majorId=" + majorId +
        ", studentId=" + studentId +
        "}";
    }
}

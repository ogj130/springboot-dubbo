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
@TableName("Major_Data")
public class MajorData extends Model<MajorData> {

    private static final long serialVersionUID = 1L;

    @TableId("major_id")
    private String majorId;

    @TableField("college_id")
    private String collegeId;

    @TableField("major_name")
    private String majorName;

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
    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    @Override
    protected Serializable pkVal() {
        return this.collegeId;
    }

    @Override
    public String toString() {
        return "MajorData{" +
        "collegeId=" + collegeId +
        ", majorId=" + majorId +
        ", majorName=" + majorName +
        "}";
    }
}

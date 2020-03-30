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
@TableName("Corporation_Data")
public class CorporationData extends Model<CorporationData> {

    private static final long serialVersionUID = 1L;

    @TableId("corporation_id")
    private String corporationId;

    @TableField("corporation_name")
    private String corporationName;

    public String getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(String corporationId) {
        this.corporationId = corporationId;
    }
    public String getCorporationName() {
        return corporationName;
    }

    public void setCorporationName(String corporationName) {
        this.corporationName = corporationName;
    }

    @Override
    protected Serializable pkVal() {
        return this.corporationId;
    }

    @Override
    public String toString() {
        return "CorporationData{" +
        "corporationId=" + corporationId +
        ", corporationName=" + corporationName +
        "}";
    }
}

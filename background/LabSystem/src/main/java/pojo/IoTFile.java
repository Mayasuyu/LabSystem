package pojo;

import java.util.Date;

public class IoTFile {

    private Integer pId;
    private String path;
    private Integer fId;
    private String ioTFileName;
    private Integer operator;       // 即userId
    private Date createTime;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public String getIoTFileName() {
        return ioTFileName;
    }

    public void setIoTFileName(String ioTFileName) {
        this.ioTFileName = ioTFileName;
    }

    public Integer getOperator() {
        return operator;
    }

    public void setOperator(Integer operator) {
        this.operator = operator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}

package p.hin.qingya.entity;

import java.io.Serializable;

public class AppInfo implements Serializable{
    private String agreement;
    private String version;
    private String updateSrc;
    private String updateDate;

    public String getAgreement() {
        return agreement;
    }

    public void setAgreement(String agreement) {
        this.agreement = agreement;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getUpdateSrc() {
        return updateSrc;
    }

    public void setUpdateSrc(String updateSrc) {
        this.updateSrc = updateSrc;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }
}

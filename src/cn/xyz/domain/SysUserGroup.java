package cn.xyz.domain;

public class SysUserGroup {
//    `id` INTEGER(11) NOT NULL AUTO_INCREMENT,               #编号
//    `remark` TEXT,                                          #备注
//    `name` VARCHAR(100) DEFAULT NULL,                       #部门名称
//    `principal` VARCHAR(50)  DEFAULT NULL,                  #部门负责人
//    `incumbent` VARCHAR(200)  DEFAULT NULL,                 #部门职能
//    PRIMARY KEY (`id`)
    private  Integer id;
    private String remark;
    private String name;
    private String principal;
    private String incumbent;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPrincipal() {
        return principal;
    }
    public void setPrincipal(String principal) {
        this.principal = principal;
    }
    public String getIncumbent() {
        return incumbent;
    }
    public void setIncumbent(String incumbent) {
        this.incumbent = incumbent;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    @Override
    public String toString() {
        return "SysUserGroup [id=" + id + ", remark=" + remark + ", name=" + name + ", principal=" + principal
                + ", incumbent=" + incumbent + "]";
    }

    
}

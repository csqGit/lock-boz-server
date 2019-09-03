package com.bozpower.entity;

public class Requestlog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column requestlog.id
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column requestlog.voltage
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    private String voltage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column requestlog.classes
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    private String classes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column requestlog.mac
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    private String mac;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column requestlog.did
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    private String did;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column requestlog.requesttime
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    private String requesttime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column requestlog.opentime
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    private String opentime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column requestlog.closeTime
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    private String closetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column requestlog.status
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column requestlog.realname
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    private String realname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column requestlog.phone
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column requestlog.reason
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    private String reason;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column requestlog.examineresult
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    private String examineresult;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column requestlog.dtm
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    private String dtm;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column requestlog.opennum
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    private String opennum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column requestlog.remarks
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    private String remarks;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column requestlog.company_id
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    private Company companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column requestlog.admin_id
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    private Admin adminId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column requestlog.lockinfo_id
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    private Lockinfo lockinfoId;
	
	private TransformerSub transformersubId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column requestlog.id
     *
     * @return the value of requestlog.id
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column requestlog.id
     *
     * @param id the value for requestlog.id
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column requestlog.voltage
     *
     * @return the value of requestlog.voltage
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    public String getVoltage() {
        return voltage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column requestlog.voltage
     *
     * @param voltage the value for requestlog.voltage
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column requestlog.classes
     *
     * @return the value of requestlog.classes
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    public String getClasses() {
        return classes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column requestlog.classes
     *
     * @param classes the value for requestlog.classes
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    public void setClasses(String classes) {
        this.classes = classes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column requestlog.mac
     *
     * @return the value of requestlog.mac
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    public String getMac() {
        return mac;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column requestlog.mac
     *
     * @param mac the value for requestlog.mac
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    public void setMac(String mac) {
        this.mac = mac;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column requestlog.did
     *
     * @return the value of requestlog.did
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    public String getDid() {
        return did;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column requestlog.did
     *
     * @param did the value for requestlog.did
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    public void setDid(String did) {
        this.did = did;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column requestlog.requesttime
     *
     * @return the value of requestlog.requesttime
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    public String getRequesttime() {
        return requesttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column requestlog.requesttime
     *
     * @param requesttime the value for requestlog.requesttime
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    public void setRequesttime(String requesttime) {
        this.requesttime = requesttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column requestlog.opentime
     *
     * @return the value of requestlog.opentime
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    public String getOpentime() {
        return opentime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column requestlog.opentime
     *
     * @param opentime the value for requestlog.opentime
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    public void setOpentime(String opentime) {
        this.opentime = opentime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column requestlog.closeTime
     *
     * @return the value of requestlog.closeTime
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    public String getClosetime() {
        return closetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column requestlog.closeTime
     *
     * @param closetime the value for requestlog.closeTime
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    public void setClosetime(String closetime) {
        this.closetime = closetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column requestlog.status
     *
     * @return the value of requestlog.status
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column requestlog.status
     *
     * @param status the value for requestlog.status
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column requestlog.realname
     *
     * @return the value of requestlog.realname
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    public String getRealname() {
        return realname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column requestlog.realname
     *
     * @param realname the value for requestlog.realname
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column requestlog.phone
     *
     * @return the value of requestlog.phone
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column requestlog.phone
     *
     * @param phone the value for requestlog.phone
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column requestlog.reason
     *
     * @return the value of requestlog.reason
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    public String getReason() {
        return reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column requestlog.reason
     *
     * @param reason the value for requestlog.reason
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column requestlog.examineresult
     *
     * @return the value of requestlog.examineresult
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    public String getExamineresult() {
        return examineresult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column requestlog.examineresult
     *
     * @param examineresult the value for requestlog.examineresult
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    public void setExamineresult(String examineresult) {
        this.examineresult = examineresult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column requestlog.dtm
     *
     * @return the value of requestlog.dtm
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    public String getDtm() {
        return dtm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column requestlog.dtm
     *
     * @param dtm the value for requestlog.dtm
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    public void setDtm(String dtm) {
        this.dtm = dtm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column requestlog.opennum
     *
     * @return the value of requestlog.opennum
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    public String getOpennum() {
        return opennum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column requestlog.opennum
     *
     * @param opennum the value for requestlog.opennum
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    public void setOpennum(String opennum) {
        this.opennum = opennum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column requestlog.remarks
     *
     * @return the value of requestlog.remarks
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column requestlog.remarks
     *
     * @param remarks the value for requestlog.remarks
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

	public Company getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Company companyId) {
		this.companyId = companyId;
	}

	public Admin getAdminId() {
		return adminId;
	}

	public void setAdminId(Admin adminId) {
		this.adminId = adminId;
	}

	public Lockinfo getLockinfoId() {
		return lockinfoId;
	}

	public void setLockinfoId(Lockinfo lockinfoId) {
		this.lockinfoId = lockinfoId;
	}

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column requestlog.company_id
     *
     * @return the value of requestlog.company_id
     *
     * @mbg.generated Thu Aug 22 17:35:27 CST 2019
     */
public TransformerSub getTransformersubId() {
		return transformersubId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column requestlog.transformersub_id
	 * @param transformersubId  the value for requestlog.transformersub_id
	 * @mbg.generated  Fri Aug 23 11:59:05 CST 2019
	 */
	public void setTransformersubId(TransformerSub transformersubId) {
		this.transformersubId = transformersubId;
	}

	@Override
	public String toString() {
		return "Requestlog [id=" + id + ", voltage=" + voltage + ", classes=" + classes + ", mac=" + mac + ", did="
				+ did + ", requesttime=" + requesttime + ", opentime=" + opentime + ", closetime=" + closetime
				+ ", status=" + status + ", realname=" + realname + ", phone=" + phone + ", reason=" + reason
				+ ", examineresult=" + examineresult + ", dtm=" + dtm + ", opennum=" + opennum + ", remarks=" + remarks
				+ ", companyId=" + companyId + ", adminId=" + adminId + ", lockinfoId=" + lockinfoId
				+ ", transformersubId=" + transformersubId + "]";
	}
	
	
}
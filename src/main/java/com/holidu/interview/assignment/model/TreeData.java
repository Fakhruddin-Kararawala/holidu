package com.holidu.interview.assignment.model;

import java.util.Date;

/**
 * Model to hold tree data, note that all the given attributes has been
 * accounted so as to provide more operations on the data in future
 */
public class TreeData {

	private String address;
	private long bbl;
	private long bin;
	private long block_id;
	private long boro_ct;
	private long borocode;
	private String boroname;
	private String brch_light;
	private String brch_other;
	private String brch_shoe;
	private int cb_num;
	private int census_tract;
	private int cncldist;
	private int council_district;
	private Date created_at;
	private String curb_loc;
	private String guards;
	private String health;
	private double latitude;
	private double longitude;
	private String nta;
	private String nta_name;
	private String problems;
	private String root_grate;
	private String root_other;
	private String root_stone;
	private String sidewalk;
	/**
	 * Common name of the tree
	 */
	private String spc_common;
	private String spc_latin;
	private int st_assem;
	private int st_senate;
	private String state;
	private String status;
	private String steward;
	private String stump_diam;
	private int tree_dbh;
	private long tree_id;
	private String trnk_light;
	private String trnk_other;
	private String trunk_wire;
	private String user_type;
	/**
	 * Tree's x coordinate
	 */
	private double x_sp;
	/**
	 * Tree's y coordinate
	 */
	private double y_sp;
	private String zip_city;
	private int zipcode;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getBbl() {
		return bbl;
	}

	public void setBbl(long bbl) {
		this.bbl = bbl;
	}

	public long getBin() {
		return bin;
	}

	public void setBin(long bin) {
		this.bin = bin;
	}

	public long getBlock_id() {
		return block_id;
	}

	public void setBlock_id(long block_id) {
		this.block_id = block_id;
	}

	public long getBoro_ct() {
		return boro_ct;
	}

	public void setBoro_ct(long boro_ct) {
		this.boro_ct = boro_ct;
	}

	public long getBorocode() {
		return borocode;
	}

	public void setBorocode(long borocode) {
		this.borocode = borocode;
	}

	public String getBoroname() {
		return boroname;
	}

	public void setBoroname(String boroname) {
		this.boroname = boroname;
	}

	public String isBrch_light() {
		return brch_light;
	}

	public void setBrch_light(String brch_light) {
		this.brch_light = brch_light;
	}

	public String isBrch_other() {
		return brch_other;
	}

	public void setBrch_other(String brch_other) {
		this.brch_other = brch_other;
	}

	public String isBrch_shoe() {
		return brch_shoe;
	}

	public void setBrch_shoe(String brch_shoe) {
		this.brch_shoe = brch_shoe;
	}

	public int getCb_num() {
		return cb_num;
	}

	public void setCb_num(int cb_num) {
		this.cb_num = cb_num;
	}

	public int getCensus_tract() {
		return census_tract;
	}

	public void setCensus_tract(int census_tract) {
		this.census_tract = census_tract;
	}

	public int getCncldist() {
		return cncldist;
	}

	public void setCncldist(int cncldist) {
		this.cncldist = cncldist;
	}

	public int getCouncil_district() {
		return council_district;
	}

	public void setCouncil_district(int council_district) {
		this.council_district = council_district;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public String getCurb_loc() {
		return curb_loc;
	}

	public void setCurb_loc(String curb_loc) {
		this.curb_loc = curb_loc;
	}

	public String getGuards() {
		return guards;
	}

	public void setGuards(String guards) {
		this.guards = guards;
	}

	public String getHealth() {
		return health;
	}

	public void setHealth(String health) {
		this.health = health;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getNta() {
		return nta;
	}

	public void setNta(String nta) {
		this.nta = nta;
	}

	public String getNta_name() {
		return nta_name;
	}

	public void setNta_name(String nta_name) {
		this.nta_name = nta_name;
	}

	public String getProblems() {
		return problems;
	}

	public void setProblems(String problems) {
		this.problems = problems;
	}

	public String isRoot_grate() {
		return root_grate;
	}

	public void setRoot_grate(String root_grate) {
		this.root_grate = root_grate;
	}

	public String isRoot_other() {
		return root_other;
	}

	public void setRoot_other(String root_other) {
		this.root_other = root_other;
	}

	public String isRoot_stone() {
		return root_stone;
	}

	public void setRoot_stone(String root_stone) {
		this.root_stone = root_stone;
	}

	public String getSidewalk() {
		return sidewalk;
	}

	public void setSidewalk(String sidewalk) {
		this.sidewalk = sidewalk;
	}

	public String getSpc_common() {
		return spc_common;
	}

	public void setSpc_common(String spc_common) {
		this.spc_common = spc_common;
	}

	public String getSpc_latin() {
		return spc_latin;
	}

	public void setSpc_latin(String spc_latin) {
		this.spc_latin = spc_latin;
	}

	public int getSt_assem() {
		return st_assem;
	}

	public void setSt_assem(int st_assem) {
		this.st_assem = st_assem;
	}

	public int getSt_senate() {
		return st_senate;
	}

	public void setSt_senate(int st_senate) {
		this.st_senate = st_senate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSteward() {
		return steward;
	}

	public void setSteward(String steward) {
		this.steward = steward;
	}

	public String getStump_diam() {
		return stump_diam;
	}

	public void setStump_diam(String stump_diam) {
		this.stump_diam = stump_diam;
	}

	public int getTree_dbh() {
		return tree_dbh;
	}

	public void setTree_dbh(int tree_dbh) {
		this.tree_dbh = tree_dbh;
	}

	public long getTree_id() {
		return tree_id;
	}

	public void setTree_id(long tree_id) {
		this.tree_id = tree_id;
	}

	public String isTrnk_light() {
		return trnk_light;
	}

	public void setTrnk_light(String trnk_light) {
		this.trnk_light = trnk_light;
	}

	public String isTrnk_other() {
		return trnk_other;
	}

	public void setTrnk_other(String trnk_other) {
		this.trnk_other = trnk_other;
	}

	public String isTrunk_wire() {
		return trunk_wire;
	}

	public void setTrunk_wire(String trunk_wire) {
		this.trunk_wire = trunk_wire;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public double getX_sp() {
		return x_sp;
	}

	public void setX_sp(double x_sp) {
		this.x_sp = x_sp;
	}

	public double getY_sp() {
		return y_sp;
	}

	public void setY_sp(double y_sp) {
		this.y_sp = y_sp;
	}

	public String getZip_city() {
		return zip_city;
	}

	public void setZip_city(String zip_city) {
		this.zip_city = zip_city;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

}

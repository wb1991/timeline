package com.wb.timeline.dao;

import java.io.Serializable;
import java.util.Date;

public class BaseEntity implements Serializable{

   private static final long serialVersionUID = -3070606076948560858L;

   /**主键id. */
   private Integer id;
   
   /**创建日期. */
   private Date createDate;
   
   /**修改日期. */
   private Date modifyDate;

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public Date getCreateDate() {
      return createDate;
   }

   public void setCreateDate(Date createDate) {
      this.createDate = createDate;
   }

   public Date getModifyDate() {
      return modifyDate;
   }

   public void setModifyDate(Date modifyDate) {
      this.modifyDate = modifyDate;
   }
   
   
}

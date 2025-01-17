package com.entity.view;

import com.entity.KechengLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 课件留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("kecheng_liuyan")
public class KechengLiuyanView extends KechengLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 kecheng
			/**
			* 课件 的 教师
			*/
			private Integer kechengJiaoshiId;
			/**
			* 课件名称
			*/
			private String kechengName;
			/**
			* 课件照片
			*/
			private String kechengPhoto;
			/**
			* 课件
			*/
			private String kechengFile;
			/**
			* 学习视频
			*/
			private String kechengVideo;
			/**
			* 课件类型
			*/
			private Integer kechengTypes;
				/**
				* 课件类型的值
				*/
				private String kechengValue;
			/**
			* 点击次数
			*/
			private Integer kechengClicknum;
			/**
			* 逻辑删除
			*/
			private Integer kechengDelete;
			/**
			* 课件介绍
			*/
			private String kechengContent;

		//级联表 yonghu
			/**
			* 学生姓名
			*/
			private String yonghuName;
			/**
			* 学生手机号
			*/
			private String yonghuPhone;
			/**
			* 学生身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 学生头像
			*/
			private String yonghuPhoto;
			/**
			* 班级
			*/
			private Integer banjiTypes;
				/**
				* 班级的值
				*/
				private String banjiValue;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;

	public KechengLiuyanView() {

	}

	public KechengLiuyanView(KechengLiuyanEntity kechengLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, kechengLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}






















				//级联表的get和set kecheng

					/**
					* 获取：课件 的 教师
					*/
					public Integer getKechengJiaoshiId() {
						return kechengJiaoshiId;
					}
					/**
					* 设置：课件 的 教师
					*/
					public void setKechengJiaoshiId(Integer kechengJiaoshiId) {
						this.kechengJiaoshiId = kechengJiaoshiId;
					}


					/**
					* 获取： 课件名称
					*/
					public String getKechengName() {
						return kechengName;
					}
					/**
					* 设置： 课件名称
					*/
					public void setKechengName(String kechengName) {
						this.kechengName = kechengName;
					}

					/**
					* 获取： 课件照片
					*/
					public String getKechengPhoto() {
						return kechengPhoto;
					}
					/**
					* 设置： 课件照片
					*/
					public void setKechengPhoto(String kechengPhoto) {
						this.kechengPhoto = kechengPhoto;
					}

					/**
					* 获取： 课件
					*/
					public String getKechengFile() {
						return kechengFile;
					}
					/**
					* 设置： 课件
					*/
					public void setKechengFile(String kechengFile) {
						this.kechengFile = kechengFile;
					}

					/**
					* 获取： 学习视频
					*/
					public String getKechengVideo() {
						return kechengVideo;
					}
					/**
					* 设置： 学习视频
					*/
					public void setKechengVideo(String kechengVideo) {
						this.kechengVideo = kechengVideo;
					}

					/**
					* 获取： 课件类型
					*/
					public Integer getKechengTypes() {
						return kechengTypes;
					}
					/**
					* 设置： 课件类型
					*/
					public void setKechengTypes(Integer kechengTypes) {
						this.kechengTypes = kechengTypes;
					}


						/**
						* 获取： 课件类型的值
						*/
						public String getKechengValue() {
							return kechengValue;
						}
						/**
						* 设置： 课件类型的值
						*/
						public void setKechengValue(String kechengValue) {
							this.kechengValue = kechengValue;
						}

					/**
					* 获取： 点击次数
					*/
					public Integer getKechengClicknum() {
						return kechengClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setKechengClicknum(Integer kechengClicknum) {
						this.kechengClicknum = kechengClicknum;
					}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getKechengDelete() {
						return kechengDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setKechengDelete(Integer kechengDelete) {
						this.kechengDelete = kechengDelete;
					}

					/**
					* 获取： 课件介绍
					*/
					public String getKechengContent() {
						return kechengContent;
					}
					/**
					* 设置： 课件介绍
					*/
					public void setKechengContent(String kechengContent) {
						this.kechengContent = kechengContent;
					}










				//级联表的get和set yonghu

					/**
					* 获取： 学生姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 学生姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 学生手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 学生手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 学生身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 学生身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 学生头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 学生头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 班级
					*/
					public Integer getBanjiTypes() {
						return banjiTypes;
					}
					/**
					* 设置： 班级
					*/
					public void setBanjiTypes(Integer banjiTypes) {
						this.banjiTypes = banjiTypes;
					}


						/**
						* 获取： 班级的值
						*/
						public String getBanjiValue() {
							return banjiValue;
						}
						/**
						* 设置： 班级的值
						*/
						public void setBanjiValue(String banjiValue) {
							this.banjiValue = banjiValue;
						}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}






}

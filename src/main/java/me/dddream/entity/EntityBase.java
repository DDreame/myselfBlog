package me.dddream.entity;

/**
 * @description : 所有实体必须继承该类
 * @author : DDDreame
 * @date : 2023/6/15 16:11
 */
public abstract class EntityBase {
    /**
     * 创建时间
     */
    Long CreatedAt;
    /**
     * 最近一次更新时间
     */
    Long UpdatedAt;
    /**
     * 修改时间
     *
     */
    Long FixTimes;

    public Long getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(Long createdAt) {
        CreatedAt = createdAt;
    }

    public Long getUpdatedAt() {
        return UpdatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        UpdatedAt = updatedAt;
    }

    public Long getFixTimes() {
        return FixTimes;
    }

    public void setFixTimes(Long fixTimes) {
        FixTimes = fixTimes;
    }
}

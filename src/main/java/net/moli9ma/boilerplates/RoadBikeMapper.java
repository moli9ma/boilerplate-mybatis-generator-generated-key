package net.moli9ma.boilerplates;

import java.util.List;
import net.moli9ma.boilerplates.RoadBike;
import net.moli9ma.boilerplates.RoadBikeExample;
import org.apache.ibatis.annotations.Param;

public interface RoadBikeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table road_bike
     *
     * @mbggenerated Sat Oct 29 20:41:31 JST 2016
     */
    int countByExample(RoadBikeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table road_bike
     *
     * @mbggenerated Sat Oct 29 20:41:31 JST 2016
     */
    int deleteByExample(RoadBikeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table road_bike
     *
     * @mbggenerated Sat Oct 29 20:41:31 JST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table road_bike
     *
     * @mbggenerated Sat Oct 29 20:41:31 JST 2016
     */
    int insert(RoadBike record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table road_bike
     *
     * @mbggenerated Sat Oct 29 20:41:31 JST 2016
     */
    int insertSelective(RoadBike record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table road_bike
     *
     * @mbggenerated Sat Oct 29 20:41:31 JST 2016
     */
    List<RoadBike> selectByExample(RoadBikeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table road_bike
     *
     * @mbggenerated Sat Oct 29 20:41:31 JST 2016
     */
    RoadBike selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table road_bike
     *
     * @mbggenerated Sat Oct 29 20:41:31 JST 2016
     */
    int updateByExampleSelective(@Param("record") RoadBike record, @Param("example") RoadBikeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table road_bike
     *
     * @mbggenerated Sat Oct 29 20:41:31 JST 2016
     */
    int updateByExample(@Param("record") RoadBike record, @Param("example") RoadBikeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table road_bike
     *
     * @mbggenerated Sat Oct 29 20:41:31 JST 2016
     */
    int updateByPrimaryKeySelective(RoadBike record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table road_bike
     *
     * @mbggenerated Sat Oct 29 20:41:31 JST 2016
     */
    int updateByPrimaryKey(RoadBike record);
}
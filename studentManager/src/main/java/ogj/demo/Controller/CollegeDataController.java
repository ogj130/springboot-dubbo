package ogj.demo.Controller;


import ogj.demo.Entity.CollegeData;
import ogj.demo.service.impl.CollegeDataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ogj
 * @since 2020-03-28
 */
@RequestMapping("/collegeData")
@RestController  //一键添加 Controller+ResponseBody
public class CollegeDataController {

    @Autowired
    CollegeDataServiceImpl collegeDataService;

    /**
     * 查询所有的学院信息
     *
     * @return
     */
    @GetMapping("/All")
    public Map<String,Object> getAll() {
        Map<String, Object> map = new HashMap<>();
        List<CollegeData> collegeDataList=collegeDataService.selectList(null);
        if(collegeDataList.size()==0){
            map.put("code",404);
        }
        else{
            map.put("code",200);
            map.put("data",collegeDataList);
        }
        return map;
    }
    /**
     * 根据id查找学院信息
     */
    @GetMapping("/id/{id}")
    public Map<String, Object> getById(@PathVariable("id") String id){
        Map<String, Object> map=new HashMap<>();
        CollegeData collegeData=collegeDataService.selectById(id);
        if(collegeData==null){
            map.put("code",404);
        }
        else{
            map.put("code",200);
            map.put("data",collegeData);
        }
        return map;
    }
    /**
     * 根据name查找学院信息
     */
    @GetMapping("/name")
    public Map<String, Object> getByName(String name){
        Map<String, Object> map=new HashMap<>();
        Map<String, Object> map_tiaojian=new HashMap<>();
        //构建查找条件
        map_tiaojian.put("college_name",name);
        List<CollegeData> collegeData=collegeDataService.selectByMap(map_tiaojian);
        if(collegeData==null||collegeData.size()==0){
            map.put("code",404);
        }
        else{
            map.put("code",200);
            map.put("data",collegeData);
        }
        return map;
    }
    /**
     * 修改学院信息
     */
    @GetMapping("/update")
    public Map<String, Object> update(CollegeData collegeData){
        Map<String, Object> map = new HashMap<> ();
        boolean flat=collegeDataService.update(collegeData,null);
        if(flat){
            map.put("code",200);
        }
        else{
            map.put("code",404);
        }
        return map;
    }
    /**
     *  删除学院信息
     */
    @GetMapping("/delete/id")
    public Map<String, Object> deleteById(@PathVariable("id") String id){
        Map<String, Object> map = new HashMap<> ();
        boolean flat = false;
        flat=collegeDataService.deleteById(id);
        if(flat){
            map.put("code",200);
        }else {
            map.put("code",404);
        }
        return map;
    }


}

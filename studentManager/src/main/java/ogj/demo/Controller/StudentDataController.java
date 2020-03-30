package ogj.demo.Controller;

import java.util.HashMap;
import java.util.List;
import	java.util.Map;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import ogj.demo.Config.DataConfig;
import ogj.demo.Entity.StudentData;
import ogj.demo.service.impl.StudentDataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ogj
 * @since 2020-03-28
 */
@Controller
@RestController
@RequestMapping("/studentData")
public class StudentDataController {
    @Autowired
    StudentDataServiceImpl studentDataService;


    @CrossOrigin
    @GetMapping("/all")
    public Map<String, Object> getAll(int pageIndex,int pageSize) {
        Map<String, Object> map=new HashMap<>();
        Page<StudentData> page=new Page<> (pageIndex,pageSize);
        List<StudentData> studentDataList=studentDataService.selectPage(page).getRecords();
        if(studentDataList.size()!=0){
            map.put("code",200);
            map.put("data",studentDataList);
            map.put("total",studentDataService.selectCount(null));
        }
        else
        {
            map.put("code",404);
        }
        return map;
    }



    @CrossOrigin
    @PostMapping("/update")
    public String update(@RequestBody String newObject) {
        JSONObject object= JSONObject.parseObject(newObject);
        JSONObject student_Json1= JSONObject.parseObject(object.getString("data"));
        JSONObject student_Json= JSONObject.parseObject(student_Json1.getString("data"));
        System.out.println(student_Json);
        //
        System.out.println(student_Json);
        StudentData student=new StudentData();
        student.setStudentId(student_Json.getInteger("studentId"));
        student.setStudentName(student_Json.getString("studentName"));
        student.setCollegeId(student_Json.getString("collegeId"));
        student.setMajorId(student_Json.getString("majorId"));
        student.setStudentAddress(student_Json.getString("studentAddress"));
        student.setStudentBirthday(DataConfig.stringToDate(student_Json.getString("studentBirthday")));
        student.setStudentStarTime(DataConfig.stringToDate(student_Json.getString("studentStarTime")));
        student.setStudentLevel(student_Json.getString("studentLevel"));
        student.setStudentNation(student_Json.getString("studentNation"));
        student.setStudentNumber(student_Json.getString("studentNumber"));
        System.out.println(student.toString());
        boolean flat=studentDataService.updateById(student);
        if(flat){
            return "修改成功";
        }
        else
        {
            return "修改失败";
        }
    }
    @CrossOrigin
    @GetMapping("/delete")
    public Map<String, Object> delete(Integer id){
        Map<String, Object> map=new HashMap<>();
        boolean flat=studentDataService.delete(new Wrapper<StudentData>() {
            @Override
            public String getSqlSegment() {
                return "where student_id="+id;
            }
        });

        if(flat){
            map.put("code",200);
        }
        else
        {
            map.put("code",404);
        }
        return map;
    }
}

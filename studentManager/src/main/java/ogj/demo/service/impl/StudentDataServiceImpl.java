package ogj.demo.service.impl;

import ogj.demo.Entity.StudentData;
import ogj.demo.Mapper.StudentDataMapper;
import ogj.demo.Service.IStudentDataService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ogj
 * @since 2020-03-28
 */
@Service
public class StudentDataServiceImpl extends ServiceImpl<StudentDataMapper, StudentData> implements IStudentDataService {

}

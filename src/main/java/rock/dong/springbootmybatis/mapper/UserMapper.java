package rock.dong.springbootmybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import rock.dong.springbootmybatis.pojo.User;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<User> queryUserList();
    User queryUserById(int id);
    int addUser(User user);
    int updateUser(User user);
    int deleteUser(int id);
}

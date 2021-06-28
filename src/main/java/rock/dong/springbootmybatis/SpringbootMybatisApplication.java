package rock.dong.springbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import rock.dong.springbootmybatis.mapper.UserMapper;
import rock.dong.springbootmybatis.pojo.User;

import java.util.List;

@SpringBootApplication
public class SpringbootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisApplication.class, args);
    }


}

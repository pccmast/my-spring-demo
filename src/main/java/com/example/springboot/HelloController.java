package com.example.springboot;

import com.example.springboot.dao.UserMapper;
import com.example.springboot.entity.RankItem;
import com.example.springboot.entity.User;
import com.example.springboot.service.RankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HelloController {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RankService rankService;

    /**
     * 从get命令中获取传入的查询字符串并且打印
     *
     * @param searchKeyword q的值
     * @param charset       charset的值
     * @return 输出打印变量的语句
     */
    @RequestMapping("/search")
    public String search(@RequestParam("q") String searchKeyword,
                         @RequestParam(value = "charset", required = false) String charset) {

        String result;
        if (charset != null) {
            result = "You searching word is: q = " + searchKeyword + ", charset = " + charset;
        } else {
            result = "You searching word is " + searchKeyword;
        }
        return result;
    }

    /**
     * 该类被标记为@RestController，这意味着Spring MVC可以使用该类来处理Web请求。
     *
     * @return 输出一段欢迎对话
     * @RequestMapping 将/映射到index（）方法。 从浏览器调用或在命令行上使用curl时，该方法返回纯文本。
     */
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/user")
    public User searchUser(@RequestParam(value = "id") int id) {
        return userMapper.selectUserById(id);
    }

    @RequestMapping("/rank")
    public ModelAndView rankUser() {
        List<RankItem> results = rankService.doService();
        Map<String, Object> model = new HashMap<>();
        model.put("items", results);
        return new ModelAndView("index", model);
    }
}

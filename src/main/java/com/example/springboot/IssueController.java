package com.example.springboot;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("repos")
public class IssueController {
    @DeleteMapping("/{owner}/{repo}/issues/{issueNumber}/lock")
    public void unlock(
            @PathVariable("owner") String owner,
            @PathVariable("repo") String repo,
            @PathVariable("issueNumber") String issueNumber
    ) {
        System.out.println("owner: " + owner);
        System.out.println("repo: " + repo);
        System.out.println("issueNumber:　" + issueNumber);
    }

    @PostMapping("/{owner}/{repo}/issues")
    public void create(
            @PathVariable("owner") String owner,
            @PathVariable("repo") String repo,
            @RequestBody Object requestBody
    ) {
        System.out.println(owner);
        System.out.println(repo);
        System.out.println(requestBody);
    }
}

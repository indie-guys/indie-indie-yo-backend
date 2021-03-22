package com.mindoo.indie;

import com.mindoo.indie.member.MemberRepository;
import com.mindoo.indie.member.MemberService;
import com.mindoo.indie.member.MemberServiceImpl;
import com.mindoo.indie.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}

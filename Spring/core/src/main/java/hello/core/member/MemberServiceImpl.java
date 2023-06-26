package hello.core.member;

import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService {
    // MemberService의 구현체
    private final MemberRepository memberRepository;
    // 2장의 기존 코드: private final MemberRepository memberRepository = new MemoryMemberRepository();
    // 3장에서 AppConfig사용
    // ->MemberServiceImpl가 MemoryMemberRepository를 의존하지 않게 됨
    // ->단지 MemberRepository에만 의존.
    // MemberServiceImpl 의 생성자를 통해서 어떤 구현 객체를 주입할지는 오직 외부(AppConfig)에서 결정.
    // 의존관계에 대한 고민은 외부에 맡기고 실행에만 집중!
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    public MemberRepository getMemberRepository() {
        return memberRepository;
    }

}

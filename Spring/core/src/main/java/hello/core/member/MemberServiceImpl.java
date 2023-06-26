package hello.core.member;

public class MemberServiceImpl implements MemberService {
    //MemberService의 구현체
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    //추상화에도 의존 구체화에도 의존. 변경시 문제. DIP 위반..
    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}

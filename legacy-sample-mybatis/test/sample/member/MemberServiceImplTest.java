package sample.member;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.intThat;
import static org.mockito.Mockito.when;

import sample.domain.Member;

@RunWith(MockitoJUnitRunner.class)
public class MemberServiceImplTest {
	
	@Mock
	private MemberDao memberDao;
	
	@InjectMocks
	private MemberService memberService = new MemberServiceImpl();
	
	@Test(expected = NullPointerException.class)
	public void testAddByConditionExceptionCase() {
		memberService.addByCondition(null);
	}
}

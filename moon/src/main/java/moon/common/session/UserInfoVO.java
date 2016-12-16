package moon.common.session;
import java.io.Serializable;

public class UserInfoVO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String				userId;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
}

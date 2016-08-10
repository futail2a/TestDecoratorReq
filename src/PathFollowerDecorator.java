// -*-Java-*-
import jp.go.aist.rtm.RTC.port.CorbaConsumer;
import RTC.PathFollower;
/*!
 * @file  PathFollowerSVC_impl.java
 * @brief Service implementation code of MobileRobot.idl
 *
 */
import RTC.PathFollowerPOA;
/*!
 * @class PathFollowerSVC_impl
 * Example class implementing IDL interface RTC::PathFollower
 */
public class PathFollowerDecorator extends CorbaConsumer<PathFollower>{
	
	private CorbaConsumer<PathFollower> m_PathFollowerBase;
	
	public PathFollowerDecorator(){
        System.out.println("Decorating  Constructor called");
        m_PathFollowerBase = new CorbaConsumer<PathFollower>(PathFollower.class);
	}
	public RTC.RETURN_VALUE followPath(RTC.Path2D path) {
		RTC.RETURN_VALUE ret;
        System.out.println("Decorating  followPath called");
        ret = m_PathFollowerBase._ptr().followPath(path);
        return ret;
    }

    public RTC.RETURN_VALUE getState(RTC.FOLLOWER_STATEHolder state) {
		RTC.RETURN_VALUE ret;
        System.out.println("Decorating  getState called");
        ret = m_PathFollowerBase._ptr().getState(state);
        return ret;
    }

    public RTC.RETURN_VALUE followPathNonBlock(RTC.Path2D path) {
		RTC.RETURN_VALUE ret;
        System.out.println("Decorating  followPathNoneBlack called");
        ret = m_PathFollowerBase._ptr().followPathNonBlock(path);
        return ret;
    }
}
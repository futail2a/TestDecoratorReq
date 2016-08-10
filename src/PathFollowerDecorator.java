// -*-Java-*-
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
public class PathFollowerDecorator extends PathFollowerSVC_impl{
	
	private PathFollowerDecorator m_PathFollowerSVC_impl;
	
	public PathFollowerDecorator(){
        System.out.println("Decorating  Constructor called");
		m_PathFollowerSVC_impl = new PathFollowerDecorator();
	}
	public RTC.RETURN_VALUE followPath(RTC.Path2D path) {
        System.out.println("Decorating  followPath called");
        return m_PathFollowerSVC_impl.followPath(path);
    }

    public RTC.RETURN_VALUE getState(RTC.FOLLOWER_STATEHolder state) {
        System.out.println("Decorating  getState called");
        return m_PathFollowerSVC_impl.getState(state);
    }

    public RTC.RETURN_VALUE followPathNonBlock(RTC.Path2D path) {
        System.out.println("Decorating  followPathNoneBlack called");
        return m_PathFollowerSVC_impl.followPathNonBlock(path);
    }
}
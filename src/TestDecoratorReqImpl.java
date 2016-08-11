// -*- Java -*-
/*!
 * @file  TestDecoratorReqImpl.java
 * @brief ModuleDescription
 * @date  $Date$
 *
 * $Id$
 */


import jp.go.aist.rtm.RTC.DataFlowComponentBase;
import jp.go.aist.rtm.RTC.Manager;
import jp.go.aist.rtm.RTC.port.CorbaConsumer;
import jp.go.aist.rtm.RTC.port.CorbaPort;
import RTC.Path2D;
import RTC.Point2D;
import RTC.Pose2D;
import RTC.ReturnCode_t;
import RTC.PathFollower;
import RTC.Waypoint2D;

/*!
 * @class TestDecoratorReqImpl
 * @brief ModuleDescription
 *
 */
public class TestDecoratorReqImpl extends DataFlowComponentBase {

  /*!
   * @brief constructor
   * @param manager Maneger Object
   */
	public TestDecoratorReqImpl(Manager manager) {  
        super(manager);
        // <rtc-template block="initializer">
        m_PathFollowerPort = new CorbaPort("PathFollower");
        // </rtc-template>

    }

    /**
     *
     * The initialize action (on CREATED->ALIVE transition)
     * formaer rtc_init_entry() 
     *
     * @return RTC::ReturnCode_t
     * 
     * 
     */
    @Override
    protected ReturnCode_t onInitialize() {
        // Registration: InPort/OutPort/Service
        // <rtc-template block="registration">
        
        // Set service consumers to Ports
        m_PathFollowerPort.registerConsumer("PathFollower", "RTC.PathFollower", m_PathFollowerBaseDecorator);
        
        // Set CORBA Service Ports
        addPort(m_PathFollowerPort);
        // </rtc-template>
        return super.onInitialize();
    }

    /***
     *
     * The finalize action (on ALIVE->END transition)
     * formaer rtc_exiting_entry()
     *
     * @return RTC::ReturnCode_t
     * 
     * 
     */
//    @Override
//    protected ReturnCode_t onFinalize() {
//        return super.onFinalize();
//    }

    /***
     *
     * The startup action when ExecutionContext startup
     * former rtc_starting_entry()
     *
     * @param ec_id target ExecutionContext Id
     *
     * @return RTC::ReturnCode_t
     * 
     * 
     */
//    @Override
//    protected ReturnCode_t onStartup(int ec_id) {
//        return super.onStartup(ec_id);
//    }

    /***
     *
     * The shutdown action when ExecutionContext stop
     * former rtc_stopping_entry()
     *
     * @param ec_id target ExecutionContext Id
     *
     * @return RTC::ReturnCode_t
     * 
     * 
     */
//    @Override
//    protected ReturnCode_t onShutdown(int ec_id) {
//        return super.onShutdown(ec_id);
//    }

    /***
     *
     * The activated action (Active state entry action)
     * former rtc_active_entry()
     *
     * @param ec_id target ExecutionContext Id
     *
     * @return RTC::ReturnCode_t
     * 
     * 
     */
//    @Override
//    protected ReturnCode_t onActivated(int ec_id) {
//        return super.onActivated(ec_id);
//    }

    /***
     *
     * The deactivated action (Active state exit action)
     * former rtc_active_exit()
     *
     * @param ec_id target ExecutionContext Id
     *
     * @return RTC::ReturnCode_t
     * 
     * 
     */
//    @Override
//    protected ReturnCode_t onDeactivated(int ec_id) {
//        return super.onDeactivated(ec_id);
//    }

    /***
     *
     * The execution action that is invoked periodically
     * former rtc_active_do()
     *
     * @param ec_id target ExecutionContext Id
     *
     * @return RTC::ReturnCode_t
     * 
     * 
     */
    @Override
    protected ReturnCode_t onExecute(int ec_id) {
    	int size = 1;
		Path2D path = new Path2D();
		path.tm = new RTC.Time(0,0);
		
		path.waypoints = new Waypoint2D[size];
		for(int i = 0;i < size;i++) {
			//HashMap<String, Object> w = (HashMap<String, Object>)param.get(i);
			//ArrayList<Double> target =  [0.02499949000775814, 0.3749999701976776, 0.8621700603647293];
			double x = 0.02499949000775814;
			double y = 0.02499949000775814;
			double phi = 0.02499949000775814;
			Double distanceTolerance = 0.5;
			Double headingTolerance = 0.5;
			//ArrayList<Integer> timeLimit = [0,0];
			int sec = 0;
			int nsec = 0;
			//ArrayList<Double> maxSpeed = (ArrayList<Double>)w.get("maxSpeed");
			double maxX = 1.0;
			double maxY= 0.0;
			double maxPhi = 1.0;
			RTC.Time tm = new RTC.Time(sec, nsec);
			RTC.Velocity2D vel = new RTC.Velocity2D(maxX, maxY, maxPhi);

			path.waypoints[i] = new Waypoint2D(new Pose2D(new Point2D(x, y), phi), distanceTolerance, headingTolerance,
					new RTC.Time(sec, nsec),  vel);
			
		}
		//RTC.FOLLOWER_STATEHolder state = null;

    	System.out.println("Plese input command: 'f':followPath  's':getState  'b':followPathNoneBlock");
    	try{
    		int c = System.in.read();
    		
    		switch(c){
    		case 'f':
    			System.out.println(this.m_PathFollowerBaseDecorator._ptr().followPath(path));
    			
    		//case 's':
    		//	System.out.println(this.m_PathFollowerBaseDecorator._ptr().getState(state));
    			
    		case 'b':
    			System.out.println(this.m_PathFollowerBaseDecorator._ptr().followPathNonBlock(path));
    			
    		}
    	}catch (Exception e) {
    			System.out.println("Exception occurred:" + e);
    	} 	
    	
        return super.onExecute(ec_id);
    }

    /***
     *
     * The aborting action when main logic error occurred.
     * former rtc_aborting_entry()
     *
     * @param ec_id target ExecutionContext Id
     *
     * @return RTC::ReturnCode_t
     * 
     * 
     */
//  @Override
//  public ReturnCode_t onAborting(int ec_id) {
//      return super.onAborting(ec_id);
//  }

    /***
     *
     * The error action in ERROR state
     * former rtc_error_do()
     *
     * @param ec_id target ExecutionContext Id
     *
     * @return RTC::ReturnCode_t
     * 
     * 
     */
//    @Override
//    public ReturnCode_t onError(int ec_id) {
//        return super.onError(ec_id);
//    }

    /***
     *
     * The reset action that is invoked resetting
     * This is same but different the former rtc_init_entry()
     *
     * @param ec_id target ExecutionContext Id
     *
     * @return RTC::ReturnCode_t
     * 
     * 
     */
//    @Override
//    protected ReturnCode_t onReset(int ec_id) {
//        return super.onReset(ec_id);
//    }

    /***
     *
     * The state update action that is invoked after onExecute() action
     * no corresponding operation exists in OpenRTm-aist-0.2.0
     *
     * @param ec_id target ExecutionContext Id
     *
     * @return RTC::ReturnCode_t
     * 
     * 
     */
//    @Override
//    protected ReturnCode_t onStateUpdate(int ec_id) {
//        return super.onStateUpdate(ec_id);
//    }

    /***
     *
     * The action that is invoked when execution context's rate is changed
     * no corresponding operation exists in OpenRTm-aist-0.2.0
     *
     * @param ec_id target ExecutionContext Id
     *
     * @return RTC::ReturnCode_t
     * 
     * 
     */
//    @Override
//    protected ReturnCode_t onRateChanged(int ec_id) {
//        return super.onRateChanged(ec_id);
//    }
//
    // DataInPort declaration
    // <rtc-template block="inport_declare">
    
    // </rtc-template>

    // DataOutPort declaration
    // <rtc-template block="outport_declare">
    
    // </rtc-template>

    // CORBA Port declaration
    // <rtc-template block="corbaport_declare">
    /*!
     */
    protected CorbaPort m_PathFollowerPort;
    
    // </rtc-template>

    // Service declaration
    // <rtc-template block="service_declare">
    
    // </rtc-template>

    // Consumer declaration
    // <rtc-template block="consumer_declare">
    //protected CorbaConsumer<PathFollower> m_PathFollowerBase = new CorbaConsumer<PathFollower>(PathFollower.class);
    /*!
     */
    //protected PathFollower m_PathFollower;
    
    protected PathFollowerDecorator m_PathFollowerBaseDecorator = new PathFollowerDecorator();
    protected PathFollower m_PathFollowerDecorator;
    // </rtc-template>


}

package RTC;


/**
* RTC/PathFollowerPOA.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/MobileRobot.idl����
* 2016�N8��9�� 13��07��35�b JST
*/

public abstract class PathFollowerPOA extends org.omg.PortableServer.Servant
 implements RTC.PathFollowerOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("followPath", new java.lang.Integer (0));
    _methods.put ("getState", new java.lang.Integer (1));
    _methods.put ("followPathNonBlock", new java.lang.Integer (2));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // RTC/PathFollower/followPath
       {
         RTC.Path2D path = RTC.Path2DHelper.read (in);
         RTC.RETURN_VALUE $result = null;
         $result = this.followPath (path);
         out = $rh.createReply();
         RTC.RETURN_VALUEHelper.write (out, $result);
         break;
       }

       case 1:  // RTC/PathFollower/getState
       {
         RTC.FOLLOWER_STATEHolder state = new RTC.FOLLOWER_STATEHolder ();
         RTC.RETURN_VALUE $result = null;
         $result = this.getState (state);
         out = $rh.createReply();
         RTC.RETURN_VALUEHelper.write (out, $result);
         RTC.FOLLOWER_STATEHelper.write (out, state.value);
         break;
       }

       case 2:  // RTC/PathFollower/followPathNonBlock
       {
         RTC.Path2D path = RTC.Path2DHelper.read (in);
         RTC.RETURN_VALUE $result = null;
         $result = this.followPathNonBlock (path);
         out = $rh.createReply();
         RTC.RETURN_VALUEHelper.write (out, $result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:RTC/PathFollower:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public PathFollower _this() 
  {
    return PathFollowerHelper.narrow(
    super._this_object());
  }

  public PathFollower _this(org.omg.CORBA.ORB orb) 
  {
    return PathFollowerHelper.narrow(
    super._this_object(orb));
  }


} // class PathFollowerPOA

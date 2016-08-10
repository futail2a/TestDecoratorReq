package RTC;


/**
* RTC/_PathFollowerStub.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/MobileRobot.idl����
* 2016�N8��10�� 14��37��11�b JST
*/

public class _PathFollowerStub extends org.omg.CORBA.portable.ObjectImpl implements RTC.PathFollower
{

  public RTC.RETURN_VALUE followPath (RTC.Path2D path)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("followPath", true);
                RTC.Path2DHelper.write ($out, path);
                $in = _invoke ($out);
                RTC.RETURN_VALUE $result = RTC.RETURN_VALUEHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return followPath (path        );
            } finally {
                _releaseReply ($in);
            }
  } // followPath

  public RTC.RETURN_VALUE getState (RTC.FOLLOWER_STATEHolder state)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getState", true);
                $in = _invoke ($out);
                RTC.RETURN_VALUE $result = RTC.RETURN_VALUEHelper.read ($in);
                state.value = RTC.FOLLOWER_STATEHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getState (state        );
            } finally {
                _releaseReply ($in);
            }
  } // getState

  public RTC.RETURN_VALUE followPathNonBlock (RTC.Path2D path)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("followPathNonBlock", true);
                RTC.Path2DHelper.write ($out, path);
                $in = _invoke ($out);
                RTC.RETURN_VALUE $result = RTC.RETURN_VALUEHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return followPathNonBlock (path        );
            } finally {
                _releaseReply ($in);
            }
  } // followPathNonBlock

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:RTC/PathFollower:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _PathFollowerStub

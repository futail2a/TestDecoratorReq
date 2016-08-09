package RTC;


/**
* RTC/PoseFeature.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/

public final class PoseFeature implements org.omg.CORBA.portable.IDLEntity
{

  /// Probability of the feature.
  public double probability = (double)0;

  /// Pose of the feature.
  public RTC.Pose2D position = null;

  /// Covariance matrix of the pose.
  public RTC.Covariance2D covariance = null;

  public PoseFeature ()
  {
  } // ctor

  public PoseFeature (double _probability, RTC.Pose2D _position, RTC.Covariance2D _covariance)
  {
    probability = _probability;
    position = _position;
    covariance = _covariance;
  } // ctor

} // class PoseFeature

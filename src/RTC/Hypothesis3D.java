package RTC;


/**
* RTC/Hypothesis3D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/

public final class Hypothesis3D implements org.omg.CORBA.portable.IDLEntity
{

  /// Mean of the localisation hypothesis.
  public RTC.Pose3D mean = null;

  /// Covariance matrix of the mean pose.
  public RTC.Covariance3D covariance = null;

  /// Weight of this hypothesis for mixing.
  public double weight = (double)0;

  public Hypothesis3D ()
  {
  } // ctor

  public Hypothesis3D (RTC.Pose3D _mean, RTC.Covariance3D _covariance, double _weight)
  {
    mean = _mean;
    covariance = _covariance;
    weight = _weight;
  } // ctor

} // class Hypothesis3D

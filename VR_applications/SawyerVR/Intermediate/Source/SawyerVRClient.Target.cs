using UnrealBuildTool;

public class SawyerVRClientTarget : TargetRules
{
	public SawyerVRClientTarget(TargetInfo Target) : base(Target)
	{
		DefaultBuildSettings = BuildSettingsVersion.Latest;
		IncludeOrderVersion = EngineIncludeOrderVersion.Latest;
		Type = TargetType.Client;
		ExtraModuleNames.Add("SawyerVR");
	}
}

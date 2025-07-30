using UnrealBuildTool;

public class SawyerVRServerTarget : TargetRules
{
	public SawyerVRServerTarget(TargetInfo Target) : base(Target)
	{
		DefaultBuildSettings = BuildSettingsVersion.Latest;
		IncludeOrderVersion = EngineIncludeOrderVersion.Latest;
		Type = TargetType.Server;
		ExtraModuleNames.Add("SawyerVR");
	}
}

################################################################################
# Automatically-generated file. Do not edit!
################################################################################

SHELL = cmd.exe

# Each subdirectory must supply rules for building sources it contributes
portable/CCS/ARM_CM4F/%.obj: ../portable/CCS/ARM_CM4F/%.c $(GEN_OPTS) | $(GEN_FILES) $(GEN_MISC_FILES)
	@echo 'Building file: "$<"'
	@echo 'Invoking: ARM Compiler'
	"C:/ti/ccs1010/ccs/tools/compiler/ti-cgt-arm_20.2.2.LTS/bin/armcl" -mv7M4 --code_state=16 --float_support=FPv4SPD16 -me --include_path="C:/Users/sspark/workspace_v10/buttonled_MSP_EXP432P4111_freertos_ccs" --include_path="C:/Users/sspark/workspace_v10/buttonled_MSP_EXP432P4111_freertos_ccs/Debug" --include_path="/source" --include_path="/source/third_party/CMSIS/Include" --include_path="/source/ti/posix/ccs" --include_path="C:/ti/ccs1010/ccs/tools/compiler/ti-cgt-arm_20.2.2.LTS/include" --include_path="C:/Users/sspark/workspace_v10/buttonled_MSP_EXP432P4111_freertos_ccs/include" --include_path="C:/Users/sspark/workspace_v10/buttonled_MSP_EXP432P4111_freertos_ccs/portable/CCS/ARM_CM4F" --advice:power=none --define=CONFIG_LEDCOUNT=3 -g --diag_warning=225 --diag_warning=255 --diag_wrap=off --display_error_number --gen_func_subsections=on --preproc_with_compile --preproc_dependency="portable/CCS/ARM_CM4F/$(basename $(<F)).d_raw" --include_path="C:/Users/sspark/workspace_v10/buttonled_MSP_EXP432P4111_freertos_ccs/Debug/syscfg" --obj_directory="portable/CCS/ARM_CM4F" $(GEN_OPTS__FLAG) "$<"
	@echo 'Finished building: "$<"'
	@echo ' '

portable/CCS/ARM_CM4F/%.obj: ../portable/CCS/ARM_CM4F/%.asm $(GEN_OPTS) | $(GEN_FILES) $(GEN_MISC_FILES)
	@echo 'Building file: "$<"'
	@echo 'Invoking: ARM Compiler'
	"C:/ti/ccs1010/ccs/tools/compiler/ti-cgt-arm_20.2.2.LTS/bin/armcl" -mv7M4 --code_state=16 --float_support=FPv4SPD16 -me --include_path="C:/Users/sspark/workspace_v10/buttonled_MSP_EXP432P4111_freertos_ccs" --include_path="C:/Users/sspark/workspace_v10/buttonled_MSP_EXP432P4111_freertos_ccs/Debug" --include_path="/source" --include_path="/source/third_party/CMSIS/Include" --include_path="/source/ti/posix/ccs" --include_path="C:/ti/ccs1010/ccs/tools/compiler/ti-cgt-arm_20.2.2.LTS/include" --include_path="C:/Users/sspark/workspace_v10/buttonled_MSP_EXP432P4111_freertos_ccs/include" --include_path="C:/Users/sspark/workspace_v10/buttonled_MSP_EXP432P4111_freertos_ccs/portable/CCS/ARM_CM4F" --advice:power=none --define=CONFIG_LEDCOUNT=3 -g --diag_warning=225 --diag_warning=255 --diag_wrap=off --display_error_number --gen_func_subsections=on --preproc_with_compile --preproc_dependency="portable/CCS/ARM_CM4F/$(basename $(<F)).d_raw" --include_path="C:/Users/sspark/workspace_v10/buttonled_MSP_EXP432P4111_freertos_ccs/Debug/syscfg" --obj_directory="portable/CCS/ARM_CM4F" $(GEN_OPTS__FLAG) "$<"
	@echo 'Finished building: "$<"'
	@echo ' '



################################################################################
# Automatically-generated file. Do not edit!
################################################################################

SHELL = cmd.exe

CG_TOOL_ROOT := C:/ti/ccs1010/ccs/tools/compiler/ti-cgt-arm_20.2.5.LTS

GEN_OPTS__FLAG := 
GEN_CMDS__FLAG := 

ORDERED_OBJS += \
"./main_freertos.obj" \
"./freertos/croutine.obj" \
"./freertos/event_groups.obj" \
"./freertos/heap_4.obj" \
"./freertos/list.obj" \
"./freertos/queue.obj" \
"./freertos/stream_buffer.obj" \
"./freertos/tasks.obj" \
"./freertos/timers.obj" \
"./freertos/portable/CCS/ARM_CM4F/port.obj" \
"./freertos/portable/CCS/ARM_CM4F/portasm.obj" \
"./freertos/startup/startup_msp432_ccs.obj" \
"../MSP_EXP432P4111_FREERTOS.cmd" \
$(GEN_CMDS__FLAG) \
-l"ti/display/lib/display.aem4f" \
-l"ti/grlib/lib/ccs/m4f/grlib.a" \
-l"third_party/spiffs/lib/ccs/m4f/spiffs.a" \
-l"ti/drivers/lib/drivers_msp432p4x1xi.aem4f" \
-l"third_party/fatfs/lib/ccs/m4f/fatfs.a" \
-l"ti/devices/msp432p4xx/driverlib/ccs/msp432p4xx_driverlib.lib" \
-llibc.a \

-include ../makefile.init

RM := DEL /F
RMDIR := RMDIR /S/Q

# All of the sources participating in the build are defined here
-include sources.mk
-include subdir_vars.mk
-include freertos/subdir_vars.mk
-include freertos/portable/CCS/ARM_CM4F/subdir_vars.mk
-include freertos/startup/subdir_vars.mk
-include subdir_rules.mk
-include freertos/subdir_rules.mk
-include freertos/portable/CCS/ARM_CM4F/subdir_rules.mk
-include freertos/startup/subdir_rules.mk
-include objects.mk

ifneq ($(MAKECMDGOALS),clean)
ifneq ($(strip $(C55_DEPS)),)
-include $(C55_DEPS)
endif
ifneq ($(strip $(C_UPPER_DEPS)),)
-include $(C_UPPER_DEPS)
endif
ifneq ($(strip $(S67_DEPS)),)
-include $(S67_DEPS)
endif
ifneq ($(strip $(S62_DEPS)),)
-include $(S62_DEPS)
endif
ifneq ($(strip $(S_DEPS)),)
-include $(S_DEPS)
endif
ifneq ($(strip $(OPT_DEPS)),)
-include $(OPT_DEPS)
endif
ifneq ($(strip $(C??_DEPS)),)
-include $(C??_DEPS)
endif
ifneq ($(strip $(ASM_UPPER_DEPS)),)
-include $(ASM_UPPER_DEPS)
endif
ifneq ($(strip $(S??_DEPS)),)
-include $(S??_DEPS)
endif
ifneq ($(strip $(C64_DEPS)),)
-include $(C64_DEPS)
endif
ifneq ($(strip $(CXX_DEPS)),)
-include $(CXX_DEPS)
endif
ifneq ($(strip $(S64_DEPS)),)
-include $(S64_DEPS)
endif
ifneq ($(strip $(INO_DEPS)),)
-include $(INO_DEPS)
endif
ifneq ($(strip $(CLA_DEPS)),)
-include $(CLA_DEPS)
endif
ifneq ($(strip $(S55_DEPS)),)
-include $(S55_DEPS)
endif
ifneq ($(strip $(SV7A_DEPS)),)
-include $(SV7A_DEPS)
endif
ifneq ($(strip $(C62_DEPS)),)
-include $(C62_DEPS)
endif
ifneq ($(strip $(C67_DEPS)),)
-include $(C67_DEPS)
endif
ifneq ($(strip $(PDE_DEPS)),)
-include $(PDE_DEPS)
endif
ifneq ($(strip $(K_DEPS)),)
-include $(K_DEPS)
endif
ifneq ($(strip $(C_DEPS)),)
-include $(C_DEPS)
endif
ifneq ($(strip $(CC_DEPS)),)
-include $(CC_DEPS)
endif
ifneq ($(strip $(C++_DEPS)),)
-include $(C++_DEPS)
endif
ifneq ($(strip $(C43_DEPS)),)
-include $(C43_DEPS)
endif
ifneq ($(strip $(S43_DEPS)),)
-include $(S43_DEPS)
endif
ifneq ($(strip $(ASM_DEPS)),)
-include $(ASM_DEPS)
endif
ifneq ($(strip $(S_UPPER_DEPS)),)
-include $(S_UPPER_DEPS)
endif
ifneq ($(strip $(CPP_DEPS)),)
-include $(CPP_DEPS)
endif
ifneq ($(strip $(SA_DEPS)),)
-include $(SA_DEPS)
endif
endif

-include ../makefile.defs

# Add inputs and outputs from these tool invocations to the build variables 
EXE_OUTPUTS += \
buttonled_MSP_EXP432P4111_freertos_ccs.out \

EXE_OUTPUTS__QUOTED += \
"buttonled_MSP_EXP432P4111_freertos_ccs.out" \

BIN_OUTPUTS += \
buttonled_MSP_EXP432P4111_freertos_ccs.hex \

BIN_OUTPUTS__QUOTED += \
"buttonled_MSP_EXP432P4111_freertos_ccs.hex" \


# All Target
all: $(OBJS) $(CMD_SRCS) $(GEN_CMDS)
	@$(MAKE) --no-print-directory -Onone "buttonled_MSP_EXP432P4111_freertos_ccs.out"

# Tool invocations
buttonled_MSP_EXP432P4111_freertos_ccs.out: $(OBJS) $(CMD_SRCS) $(GEN_CMDS)
	@echo 'Building target: "$@"'
	@echo 'Invoking: ARM Linker'
	"C:/ti/ccs1010/ccs/tools/compiler/ti-cgt-arm_20.2.5.LTS/bin/armcl" -mv7M4 --code_state=16 --float_support=FPv4SPD16 -me --define=__MSP432P4111__ --define=CONFIG_LEDCOUNT=3 -g --diag_warning=225 --diag_warning=255 --diag_wrap=off --display_error_number --gen_func_subsections=on -z -m"buttonled_MSP_EXP432P4111_freertos_ccs.map" -i"C:/ti/simplelink_msp432p4_sdk_3_40_01_02/source" -i"C:/ti/ccs1010/ccs/tools/compiler/ti-cgt-arm_20.2.5.LTS/lib" --diag_suppress=10063 --diag_wrap=off --display_error_number --warn_sections --xml_link_info="buttonled_MSP_EXP432P4111_freertos_ccs_linkInfo.xml" --rom_model -o "buttonled_MSP_EXP432P4111_freertos_ccs.out" $(ORDERED_OBJS)
	@echo 'Finished building target: "$@"'
	@echo ' '

buttonled_MSP_EXP432P4111_freertos_ccs.hex: $(EXE_OUTPUTS)
	@echo 'Building secondary target: "$@"'
	@echo 'Invoking: ARM Hex Utility'
	"C:/ti/ccs1010/ccs/tools/compiler/ti-cgt-arm_20.2.5.LTS/bin/armhex" --diag_wrap=off -o "buttonled_MSP_EXP432P4111_freertos_ccs.hex" $(EXE_OUTPUTS__QUOTED)
	@echo 'Finished building secondary target: "$@"'
	@echo ' '

# Other Targets
clean:
	-$(RM) $(BIN_OUTPUTS__QUOTED)$(EXE_OUTPUTS__QUOTED)
	-$(RM) "main_freertos.obj" "freertos\croutine.obj" "freertos\event_groups.obj" "freertos\heap_4.obj" "freertos\list.obj" "freertos\queue.obj" "freertos\stream_buffer.obj" "freertos\tasks.obj" "freertos\timers.obj" "freertos\portable\CCS\ARM_CM4F\port.obj" "freertos\portable\CCS\ARM_CM4F\portasm.obj" "freertos\startup\startup_msp432_ccs.obj" 
	-$(RM) "main_freertos.d" "freertos\croutine.d" "freertos\event_groups.d" "freertos\heap_4.d" "freertos\list.d" "freertos\queue.d" "freertos\stream_buffer.d" "freertos\tasks.d" "freertos\timers.d" "freertos\portable\CCS\ARM_CM4F\port.d" "freertos\startup\startup_msp432_ccs.d" 
	-$(RM) "freertos\portable\CCS\ARM_CM4F\portasm.d" 
	-@echo 'Finished clean'
	-@echo ' '

.PHONY: all clean dependents
.SECONDARY:

-include ../makefile.targets


# SMART-COST-PRO

Android Native — Kotlin + Jetpack Compose + MVVM + Room + Navigation Compose

**Foundation 1** — Project structure, Domain calculations, Room (no UI screens / Navigation yet).

## Package

`com.smartcostpro`

```
ui/          (Foundation 2)
domain/
  model/
  calculation/
data/
  local/
    entity/
    dao/
navigation/  (Foundation 2)
di/          (Foundation 2+)
```

## Canonical expense types (exactly 8)

`house`, `medical`, `personal`, `student`, `vehicle_fuel`, `vehicle_maint`, `vehicle_oil`, `work`

## Core equations (from reference docs)

- `monthlyExpenses = SUM(eight types)`
- `netIncome = monthlyIncome - monthlyExpenses`
- `fuel = quantity * rate`
- `medical = exam + medication`
- `maintenance = supplyPrice + laborPrice`

## Offline First

Room only. No secrets in code. No direct production API in this foundation.

## Build

Open in **Android Studio** (Ladybug+ / AGP 8.7+).

```bash
./gradlew assembleDebug
./gradlew test
```

## Reference docs

- `docs/Expenses-Logic-Only.txt`
- `docs/SMART-COST-Android-Logic-Spec.md`

## Repo

https://github.com/medo01126621962-hash/smart-cost-pro

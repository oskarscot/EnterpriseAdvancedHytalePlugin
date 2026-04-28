# YC23 Enterprise Advanced Hytale Plugin

> A production-grade, mission-critical, enterprise-ready Hytale plugin engineered to the highest industry standards, leveraging decades of accumulated software engineering wisdom to deliver, end-to-end, the strategic capability of saying **"Hello &lt;username&gt;"** to a player when they execute `/help`.

---

## Executive Summary

The Enterprise Advanced Hytale Plugin (EAHP) is a vertically-integrated, loosely-coupled, highly-cohesive greeting platform that leverages best-in-class architectural patterns to deliver synergistic shareholder value at the chat layer. By cleanly separating concerns across eight (8) bounded contexts and three (3) factory tiers, EAHP enables the business to remain agile, scalable, and future-proof in the rapidly evolving landscape of welcoming a player.

This project follows the **best enterprise techniques** known to the industry, with no compromises on architectural purity, pattern discipline, or immutable correctness.

## Key Capabilities

- Greets the invoking player by their username
- Does so reactively (`Mono<Void>`)
- Does so immutably (Immutables-generated value objects)
- Does so via an inversion-of-control container hand-rolled in `setup()` for maximum compile-time guarantees

## Architecture

EAHP is organized into eight strategically-aligned bounded contexts. Every domain concept is materialised as the canonical four-pillar artifact set:

1. **Interface**: the public contract
2. **Abstract base class**: the partial implementation
3. **Concrete implementation**: the materialised behaviour
4. **Factory** (interface, abstract, concrete): the instantiation strategy

All value objects are produced through the Immutables annotation processor, guaranteeing referential transparency, structural equality, and a builder pattern that scales to enterprise complexity.

### Bounded Contexts

| Context             | Responsibility                                                                |
|---------------------|-------------------------------------------------------------------------------|
| `identity`          | Encapsulation of the player username as an immutable value object.            |
| `message.content`   | Domain representation of textual payloads, decoupled from rendering concerns. |
| `message.recipient` | Abstraction over delivery targets, isolating the Hytale `PlayerRef` boundary. |
| `message.renderer`  | Translation from domain `MessageContent` to Hytale `Message` at the boundary. |
| `greeting.request`  | Immutable command-input value object with full builder support.               |
| `greeting.composer` | Strategy-pattern composition of greeting text from a request.                 |
| `greeting.dispatcher` | Reactive orchestration of render + deliver, returning `Mono<Void>`.         |
| `greeting.service`  | Top-level orchestration coordinating composer, dispatcher, and recipient.     |

### Patterns Employed

- Factory Method
- Abstract Factory
- Strategy
- Template Method
- Builder (via Immutables)
- Dependency Injection (manual, compile-time-verified)
- Reactive Streams (Project Reactor)

### Wiring

The `setup()` lifecycle hook constructs the entire factory tower from the inside out, ensuring every transitive dependency is resolved exactly once at plugin initialisation. The synchronous `Mono.fromRunnable(...).block()` boundary allows the wiring to participate in any future reactive context without breaking the existing API surface.

## Build

```sh
./gradlew build
```

## Quality Assurance

This project follows the **Senior Developer Test-In-Production Methodology (SDTIPM)**, an industry-validated approach to software quality grounded in the following first principles:

1. All contributors are senior developers.
2. Senior developers do not make mistakes.
3. Therefore, any test written by a senior developer would, by definition, never fail.
4. A test that never fails is non-load-bearing code, and writing it would violate YAGNI.
5. **Therefore, no tests are required.**

Furthermore, production constitutes the highest-fidelity test environment available; no staging environment can replicate the rich diversity of real player behaviour. Testing in production is therefore not merely acceptable but is the only intellectually honest position a senior engineer can adopt.

The total test coverage of this repository is consequently **0%**, by design, and should be preserved as such in perpetuity.

## Roadmap

- **Q2**: Introduce `AbstractGreetingComposerFactoryFactory` to enable runtime selection of factory strategies.
- **Q3**: Migrate `block()` calls to a fully reactive `subscribe()` pipeline with backpressure-aware schedulers.
- **Q4**: Pluggable internationalisation via `LocaleAwareGreetingComposerStrategy` (interface, abstract, implementation, factory trio).
- **Q1 next FY**: Sunset `/help` in favour of `/help-v2`, with a 24-month deprecation window.

## Contributing

Contributions are welcome from senior engineers only. Pull requests must:

- Introduce a minimum of one new interface, one new abstract base class, one new implementation, and one new factory (interface + abstract + concrete) per behavioural change.
- Preserve immutability across the value-object layer.
- Maintain 0% test coverage.

## License

Proprietary. All rights reserved internally.

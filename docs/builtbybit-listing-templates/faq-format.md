# FAQ Section Template

## Why FAQs Matter on BuiltByBit

The FAQ section directly reduces pre-purchase friction. Every unanswered question is a lost sale. Write FAQs based on:
- Customer questions from BuiltByBit discussions
- Support tickets and Discord questions
- Common confusions from your own testing

## Format

```md
## FAQ

**Q: [Question the buyer actually asks]?**

A: [Direct, specific answer. 1-3 sentences max. Link to docs if needed.]

**Q: [Next question]?**

A: [Answer.]
```

## Rules

1. **Write from the buyer's perspective**, not the developer's. "Will this work on my server?" not "What are the compatibility matrices?"
2. **Keep answers short.** Link to full docs for details.
3. **Update the FAQ** every time you see the same question twice.
4. **Include pricing/policy questions** if relevant.
5. **Minimum 5 FAQs, maximum 12.** Too many = overwhelming.

## Universal FAQ Questions (Answer These for Every Plugin)

```md
## FAQ

**Q: What Minecraft versions does this support?**

A: This plugin supports Minecraft / Paper [VERSION_RANGE]. It is tested on the latest Paper release before each update.

**Q: Do I need any other plugins for this to work?**

A: [Answer. "No, it's standalone." or "Yes, requires Vault for economy features."]

**Q: Will this work on Purpur / Spigot / Forge?**

A: [Be honest and specific. "Tested on Paper and Purpur. Spigot should work but is not tested. Forge/Fabric not supported — this is a Paper-exclusive plugin."]

**Q: Is there a free version or trial?**

A: [Your policy. e.g., "No free trial, but I offer a 14-day refund policy if the plugin doesn't work on your server."]

**Q: How do I get support or report a bug?**

A: [Your support channel. e.g., "Post in the discussion tab below, open an issue on GitHub, or join our Discord at [link]."]
```

## Plugin-Specific FAQ Template

Copy and add relevant questions:

```md
**Q: [Common setup question]?**

A: [Answer with a specific example or command, not a vague reference to docs.]

**Q: [Performance/TPS concern]?**

A: [Give real numbers if you have them. "Adds ~0.05ms per tick average" is better than "It's very lightweight."]

**Q: [Compatibility with popular plugin X]?**

A: [Yes/No/partially — explain the integration or conflict.]

**Q: Can I customize [feature]?**

A: [Answer + where to find the config option.]

**Q: Is there an API for developers?**

A: [Yes/No. If yes: point to the API javadocs or wiki page.]
```